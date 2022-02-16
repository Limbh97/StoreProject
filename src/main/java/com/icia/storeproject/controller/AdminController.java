package com.icia.storeproject.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
@RequiredArgsConstructor
public class AdminController {
    //관리자 페이지 폼
    @GetMapping("save")
        private String adminForm(){
        return "admin/save";
    }
}
