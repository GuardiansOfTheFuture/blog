package com.ch.controller;


import com.ch.pojo.Author;
import com.ch.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Controller
@RequestMapping()
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/loginaction")
    public String loginaction(String username, String password, String email, HttpSession session) {
        Boolean author = authorService.findAuthor(username, password, email,session);
        if (author) {
            return "index";
        }else {
            return "redirect:login";
        }
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
    @GetMapping("/registeraction")
    public String registeraction() {
        return "registeraction";
    }



    @GetMapping("/about")
    public String about() {
        return "about";
    }

}

