package com.ch.controller;

import com.alipay.api.kms.aliyun.http.HttpRequest;
import com.alipay.api.kms.aliyun.http.HttpResponse;
import com.ch.pojo.Types;
import com.ch.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */
@Controller
@RequestMapping("/types")
public class TypesController {
    @Autowired
    TypesService typesService;

    @RequestMapping("/find")
    public String findType(Model model) {
        List<Types> types = typesService.findByType();
        model.addAttribute("types", types);
        return "admin/type-blog";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "admin/blog";
    }


    @RequestMapping("/input")
    public String insertType(@RequestParam String type) {
        typesService.insertType(type);
        return "admin/type-input";
    }


    @RequestMapping("/type-input")
    public String insert() {
        return "admin/type-input";
    }


    @RequestMapping("/updatetype")
    public String update(@RequestParam String type, HttpSession session) {
        Object typebefore1 = session.getAttribute("typebefore");
        int i = typesService.uptateType(type, (String) typebefore1);
        session.removeAttribute("typebefore");
        return "redirect:find";
    }

    @RequestMapping("/update")
    public String update(@RequestParam("type") String type, Model model, HttpSession session) {
        model.addAttribute("type", type);
        session.setAttribute("typebefore", type);
        return "admin/type-update";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("type") String type, Model model) {
        int i = typesService.delType(type);
        return "redirect:find";
    }

}

