package com.bjyx.web.controller.excel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public class BathSortingDataListener extends AnalysisEventListener<T> {

    List<T> list = null;

    public BathSortingDataListener( ) {
    }
    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     */
    public BathSortingDataListener(List<T> list) {
        this.list = list;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data
     * @param context
     */
    @Override
    public void invoke(T data, AnalysisContext context) {


//        String threeSorting = data.getThreeSorting();
//        String substringTmp = threeSorting.substring(0,threeSorting.lastIndexOf("-"));
//
//        String sortingName = substringTmp.substring(substringTmp.lastIndexOf("-")+1);
//        data.setThreeSortingSimple(sortingName);

//        String[] split = threeSorting.split("-");
//        if(split.length>2){
//            data.setThreeSortingSimple(split[2]);
//        }
//        System.out.println("解析到一条数据:{}"+ JSON.toJSONString(data));
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
