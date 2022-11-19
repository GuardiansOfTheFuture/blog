package com.ch.service.impl;
import com.ch.mapper.BlogMapper;
import com.ch.pojo.Blog;
import com.ch.service.BlogService;
import com.ch.util.MarkdownUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Service
public class BlogServiceImpl implements BlogService {



    @Autowired
    BlogMapper blogMapper;

    @Override
    public int saveBlog(Blog blog) {
        return blogMapper.saveBlog(blog);
    }

    @Override
    public Blog getBlogById(int id) {
        return blogMapper.getBlogById(id);
    }

    @Override
    public Blog getBlogByIdShowHTML(int id) {
        Blog blog = blogMapper.getBlogByIdShowHTML(4);
        String blogContext = blog.getBlogContext();
        Blog blog1 = new Blog();
        blog1=blog;
        String s = MarkdownUtils.markdownToHtmlExtensions(blogContext);
        blog1.setBlogContext(s);
        return blog1;
    }
}
