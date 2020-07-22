package com.bjyx.framework.shiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import com.bjyx.common.constant.Constants;
import com.bjyx.common.constant.ShiroConstants;
import com.bjyx.common.constant.UserConstants;
import com.bjyx.common.enums.UserStatus;
import com.bjyx.common.exception.user.CaptchaException;
import com.bjyx.common.exception.user.UserBlockedException;
import com.bjyx.common.exception.user.UserDeleteException;
import com.bjyx.common.exception.user.UserNotExistsException;
import com.bjyx.common.exception.user.UserPasswordNotMatchException;
import com.bjyx.common.utils.DateUtils;
import com.bjyx.common.utils.MessageUtils;
import com.bjyx.common.utils.ServletUtils;
import com.bjyx.system.domain.SysUser;
import com.bjyx.system.service.ISysUserService;

/**
 * 登录校验方法
 *
 */
@Component
public class SysLoginService
{
    @Autowired(required=false)
    private SysPasswordService passwordService;

    @Autowired(required=false)
    private ISysUserService userService;

    /**
     * 登录
     */
    public SysUser login(String username, String password)
    {
        // 验证码校验
        if (!StringUtils.isEmpty(ServletUtils.getRequest().getAttribute(ShiroConstants.CURRENT_CAPTCHA)))
        {
            com.bjyx.framework.manager.AsyncManager.me().execute(com.bjyx.framework.manager.factory.AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.jcaptcha.error")));
            throw new CaptchaException();
        }
        // 用户名或密码为空 错误
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password))
        {
            com.bjyx.framework.manager.AsyncManager.me().execute(com.bjyx.framework.manager.factory.AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("not.null")));
            throw new UserNotExistsException();
        }
        // 密码如果不在指定范围内 错误
        if (password.length() < UserConstants.PASSWORD_MIN_LENGTH
                || password.length() > UserConstants.PASSWORD_MAX_LENGTH)
        {
            com.bjyx.framework.manager.AsyncManager.me().execute(com.bjyx.framework.manager.factory.AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.password.not.match")));
            throw new UserPasswordNotMatchException();
        }

        // 用户名不在指定范围内 错误
        if (username.length() < UserConstants.USERNAME_MIN_LENGTH
                || username.length() > UserConstants.USERNAME_MAX_LENGTH)
        {
            com.bjyx.framework.manager.AsyncManager.me().execute(com.bjyx.framework.manager.factory.AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.password.not.match")));
            throw new UserPasswordNotMatchException();
        }

        // 查询用户信息
        SysUser user = userService.selectUserByLoginName(username);

        if (user == null && maybeMobilePhoneNumber(username))
        {
            user = userService.selectUserByPhoneNumber(username);
        }

        if (user == null && maybeEmail(username))
        {
            user = userService.selectUserByEmail(username);
        }

        if (user == null)
        {
            com.bjyx.framework.manager.AsyncManager.me().execute(com.bjyx.framework.manager.factory.AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.not.exists")));
            throw new UserNotExistsException();
        }
        
        if (UserStatus.DELETED.getCode().equals(user.getDelFlag()))
        {
            com.bjyx.framework.manager.AsyncManager.me().execute(com.bjyx.framework.manager.factory.AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.password.delete")));
            throw new UserDeleteException();
        }
        
        if (UserStatus.DISABLE.getCode().equals(user.getStatus()))
        {
            com.bjyx.framework.manager.AsyncManager.me().execute(com.bjyx.framework.manager.factory.AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.blocked", user.getRemark())));
            throw new UserBlockedException();
        }

        passwordService.validate(user, password);

        com.bjyx.framework.manager.AsyncManager.me().execute(com.bjyx.framework.manager.factory.AsyncFactory.recordLogininfor(username, Constants.LOGIN_SUCCESS, MessageUtils.message("user.login.success")));
        recordLoginInfo(user);
        return user;
    }

    private boolean maybeEmail(String username)
    {
        if (!username.matches(UserConstants.EMAIL_PATTERN))
        {
            return false;
        }
        return true;
    }

    private boolean maybeMobilePhoneNumber(String username)
    {
        if (!username.matches(UserConstants.MOBILE_PHONE_NUMBER_PATTERN))
        {
            return false;
        }
        return true;
    }

    /**
     * 记录登录信息
     */
    public void recordLoginInfo(SysUser user)
    {
        user.setLoginIp(com.bjyx.framework.util.ShiroUtils.getIp());
        user.setLoginDate(DateUtils.getNowDate());
        userService.updateUserInfo(user);
    }
}
