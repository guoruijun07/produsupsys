package com.bjyx.common.core.page;

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
        pageDomain.setPageNum(com.bjyx.common.utils.ServletUtils.getParameterToInt(com.bjyx.common.constant.Constants.PAGE_NUM));
        pageDomain.setPageSize(com.bjyx.common.utils.ServletUtils.getParameterToInt(com.bjyx.common.constant.Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(com.bjyx.common.utils.ServletUtils.getParameter(com.bjyx.common.constant.Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(com.bjyx.common.utils.ServletUtils.getParameter(com.bjyx.common.constant.Constants.IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }
}
