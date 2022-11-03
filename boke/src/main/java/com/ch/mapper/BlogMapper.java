package com.ch.mapper;



import com.ch.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
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
public interface BlogMapper{



    int saveBlog(Blog blog);

    Blog getBlogById(int id);


    Blog getBlogByIdShowHTML(int id);


}
