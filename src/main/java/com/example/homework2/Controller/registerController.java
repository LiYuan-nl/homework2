package com.example.homework2.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class registerController {
    @RequestMapping("/register")
    public String register(){
        return "/register";
    }

    @RequestMapping(value = "/inregister", method = RequestMethod.POST)
    public String register(String username, String password) {
        //TODO:进行数据库注入
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "redirect:tologin";
    }
}
