package com.ruoyi.web.controller.excel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.ruoyi.common.bean.bo.AddressOriginalBO;

import java.util.List;

public class AddressOriginalListener extends AnalysisEventListener<AddressOriginalBO> {

    List<AddressOriginalBO> list = null;

    public AddressOriginalListener( ) {
    }
    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     */
    public AddressOriginalListener(List<AddressOriginalBO> list) {
        this.list = list;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data
     * @param context
     */
    @Override
    public void invoke(AddressOriginalBO data, AnalysisContext context) {

        list.add(data);
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

//        System.out.println(JSON.toJSONString(list));
    }
}
