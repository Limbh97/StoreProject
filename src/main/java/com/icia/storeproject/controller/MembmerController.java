package com.icia.storeproject.controller;

import com.icia.storeproject.dto.MemberSaveDTO;
import com.icia.storeproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
}
