package com.ruoyi.common.core.page;

/**
 * 表格数据处理
 *
 */
public class TableSupport
{
    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(com.ruoyi.common.utils.ServletUtils.getParameterToInt(com.ruoyi.common.constant.Constants.PAGE_NUM));
        pageDomain.setPageSize(com.ruoyi.common.utils.ServletUtils.getParameterToInt(com.ruoyi.common.constant.Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(com.ruoyi.common.utils.ServletUtils.getParameter(com.ruoyi.common.constant.Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(com.ruoyi.common.utils.ServletUtils.getParameter(com.ruoyi.common.constant.Constants.IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }
}
