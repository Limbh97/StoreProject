package com.icia.storeproject.service;

import com.icia.storeproject.dto.MemberLoginDTO;
import com.icia.storeproject.dto.MemberSaveDTO;

public interface MemberService {
    //회원가입 처리
    Long save(MemberSaveDTO memberSaveDTO);

    //중복체크
    String idDp(String memberId);

    //로그인 처리
    boolean login(MemberLoginDTO memberLoginDTO);
}
