package com.ch.service;
import com.ch.pojo.Blog;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Service
public interface BlogService {
    int saveBlog(Blog blog);

    Blog getBlogById(int id);

    Blog getBlogByIdShowHTML(int id);
}
