package com.ch.mapper;




import com.ch.pojo.Author;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

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
public interface AuthorMapper{

    Author findAuthor(String username, String password,String email);

    int updateAuthor(int id);
}
