package com.ch.controller;


import com.ch.pojo.Blog;
import com.ch.service.BlogService;
import com.ch.util.MarkdownUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Controller
@RequestMapping()
public class BlogController {


    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/blogcontext")
    public String blogcontext(Model model) {
        Blog blog = blogService.getBlogByIdShowHTML(4);
        model.addAttribute("blog",blog);
        return "blogcontext";
    }

    @GetMapping("/bloglist")
    public String bloglist() {
        return "bloglist";
    }



    @RequestMapping("/blog-input")
    public String blogInput() {
        return "admin/blog-input";
    }

    @RequestMapping("/save")
    public String save(@RequestParam String blogContext) {
        Blog blog = new Blog();
        blog.setViewCount(500);
        blog.setAuthor("chenhao");
        blog.setBlogTypes("前端");
        blog.setStatus("发布");
        blog.setBlogContext(blogContext);
        int i = blogService.saveBlog(blog);
        return "admin/blog-input";

    }




}

