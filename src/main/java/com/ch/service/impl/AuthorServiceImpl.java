package com.ch.service.impl;


import com.ch.mapper.AuthorMapper;
import com.ch.pojo.Author;
import com.ch.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorMapper authorMapper;


    @Override
    public Boolean findAuthor(String username, String password, String email, HttpSession session) {
        Author author = authorMapper.findAuthor(username, password, email);
        if (author != null){
            session.setAttribute("author",author);
            return true;
        }else {
            return false;
        }
    }


}
