package com.icia.storeproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
    //메인화면
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
