package com.ch.service.impl;

import com.ch.mapper.TypesMapper;
import com.ch.pojo.Types;
import com.ch.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Service
public class TypesServiceImpl implements TypesService {

    @Autowired
    TypesMapper typesMapper;


    @Override
    public List<Types> findByType() {
        return typesMapper.findByType();
    }

    @Override
    public int insertType(String type) {
        return typesMapper.insertType(type);
    }

    @Override
    public Boolean isExist(String type) {
        Types exist = typesMapper.isExist(type);
        if (type.equals(exist.getTypes())) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int uptateType(String type,String typebefore) {
        return typesMapper.uptateType(type,typebefore);
    }

    @Override
    public int delType(String type) {
        return typesMapper.delType(type);
    }
}
