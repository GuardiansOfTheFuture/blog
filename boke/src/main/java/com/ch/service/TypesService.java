package com.ch.service;


import com.ch.pojo.Types;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
public interface TypesService{


    /**
     *  查询所有的分类
     *
     * @return
     */
    List<Types> findByType();

    /**
     * 新增一个 type
     * @return
     */
    int insertType(String type);

    /**
     * 判断是否存在 不存在那么可以直接保存
     * 如果不存在 则直接保存
     * @param type
     * @return
     */
    Boolean isExist(String type);



    int uptateType(String type,String typebefore);

    int delType(String type);
}
