package com.ch;

import com.ch.mapper.AuthorMapper;
import com.ch.mapper.BlogMapper;
import com.ch.mapper.TypesMapper;
import com.ch.pojo.Author;
import com.ch.pojo.Blog;
import com.ch.pojo.Types;
import com.ch.service.TypesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BokeApplicationTests {


    @Autowired
    AuthorMapper authorMapper;
    @Autowired
    TypesMapper typesMapper;
    @Autowired
    TypesService typesService;

    @Autowired
    BlogMapper blogMapper;


    @Test
    void contextLoads() {
//        Author chenhao = authorMapper.findAuthor("chenhao", "123456", "chenhao@163.com");
//        System.out.println(chenhao);

//        Blog blogById = blogMapper.getBlogById(2);
//        System.out.println(blogById);

//        Blog blog = new Blog();
//        blog.setAuthor("chenhao");
//        blog.setBlogContext("nihao");
//        blog.setStatus("发布");
//        blog.setViewCount(500);
//        blog.setBlogTypes("前端");
//
//        int i = blogMapper.saveBlog(blog);
//        System.out.println(i);


//        typesMapper.insertType("前端");
//        List<Types> byType = typesMapper.findByType();
//        System.out.println(byType);
//        Boolean bolean = typesService.isExist("前端");
//        System.out.println(bolean);


    }

}
