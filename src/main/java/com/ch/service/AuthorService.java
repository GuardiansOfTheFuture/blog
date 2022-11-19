package com.ch.service;


import com.ch.pojo.Author;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Service
public interface AuthorService{

    Boolean findAuthor(String username, String password, String email, HttpSession session);


}
