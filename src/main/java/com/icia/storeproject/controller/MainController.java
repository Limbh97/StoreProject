package com.icia.storeproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller

public class MainController {
    //메인화면
    @GetMapping("/")
    public String index(){
        return "index";
    }
    //로그아웃
    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        System.out.println("MemberController.logout");
        return "index";
    }
}
