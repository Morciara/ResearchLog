package com.genealogy.researchlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/census1950")
    public String products() {
        return "census1950";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
