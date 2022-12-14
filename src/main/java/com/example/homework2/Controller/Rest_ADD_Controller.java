package com.example.homework2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest_ADD_Controller {
    @RequestMapping(value =  "/index" )
    public String Show(String name, String author, String publisher, String date, Integer number, String cover){
        return "Information of the book:" +
                "    Name: "+name+
                "    Author: "+author+
                "    Publisher: "+publisher+
                "    Publish Date: "+date+
                "    Quantity in Storage: "+number+
                "    Cover: "+cover;
    }
}
