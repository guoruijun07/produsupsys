package com.bjyx.generator.mapper;

import java.util.List;

/**
 * 业务字段 数据层
 *
 */
public interface GenTableColumnMapper
{
    /**
     * 根据表名称查询列信息
     * 
     * @param tableName 表名称
     * @return 列信息
     */
    public List<com.bjyx.generator.domain.GenTableColumn> selectDbTableColumnsByName(String tableName);
    
    /**
     * 查询业务字段列表
     * 
     * @param genTableColumn 业务字段信息
     * @return 业务字段集合
     */
    public List<com.bjyx.generator.domain.GenTableColumn> selectGenTableColumnListByTableId(com.bjyx.generator.domain.GenTableColumn genTableColumn);

    /**
     * 新增业务字段
     * 
     * @param genTableColumn 业务字段信息
     * @return 结果
     */
    public int insertGenTableColumn(com.bjyx.generator.domain.GenTableColumn genTableColumn);

    /**
     * 修改业务字段
     * 
     * @param genTableColumn 业务字段信息
     * @return 结果
     */
    public int updateGenTableColumn(com.bjyx.generator.domain.GenTableColumn genTableColumn);

    /**
     * 批量删除业务字段
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGenTableColumnByIds(Long[] ids);
}