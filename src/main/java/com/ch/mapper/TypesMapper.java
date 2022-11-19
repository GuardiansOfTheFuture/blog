package com.ch.mapper;


import com.ch.pojo.Types;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Repository
@Mapper
public interface TypesMapper  {
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

    Types isExist(String type);

    int uptateType(String type,String typebefore);

    int delType(String type);

}
