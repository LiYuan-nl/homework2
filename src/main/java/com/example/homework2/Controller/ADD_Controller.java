package com.example.homework2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ADD")
public class ADD_Controller {
    @GetMapping
    public  String index(Model model){
        //model.addAttribute("message", "Hello Spring MVC!");
        return "ADD";
    }
}
