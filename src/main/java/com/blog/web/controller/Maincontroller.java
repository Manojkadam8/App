package com.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller {

    @RequestMapping("/home")
    public String about( Model m)
    {
    	m.addAttribute("name","Manoj");
        System.out.println("inside home");
        return "Home";
    }
}

