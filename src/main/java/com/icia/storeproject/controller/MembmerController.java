package com.icia.storeproject.controller;

import com.icia.storeproject.dto.MemberLoginDTO;
import com.icia.storeproject.dto.MemberSaveDTO;
import com.icia.storeproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import static com.icia.storeproject.common.SessionConst.LOGIN_ID;

@Controller
@RequestMapping("/member/*")
@RequiredArgsConstructor
public class MembmerController {
    private final MemberService ms;

    //회원가입 폼
    @GetMapping("save")
    public String saveForm(){
        return "member/save";
    }

    //회원가입 처리
    @PostMapping("save")
    public String save(@ModelAttribute MemberSaveDTO memberSaveDTO){
        System.out.println("memberController.save");
        ms.save(memberSaveDTO);
        return "index";
    }

    //중복체크
    @PostMapping("/idDuplicate")
    public @ResponseBody String idDp(@RequestParam("loginId") String memberId){
        String result = ms.idDp(memberId);
        return result;
    }

    //로그인 폼
    @GetMapping("login")
    public String loginForm(){
        return "member/login";
    }

    //로그인 처리
    @PostMapping("login")
    public String login(@ModelAttribute MemberLoginDTO memberLoginDTO, HttpSession session){
        System.out.println("memberController.login");
        boolean login = ms.login(memberLoginDTO);
        if(login){
            session.setAttribute(LOGIN_ID,memberLoginDTO.getMemberId());
            return "/index";
        }else {
            return "member/login";
        }
    }

    //로그아웃
    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        System.out.println("MemberController.logout");
        return "index";
    }
}
