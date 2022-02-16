package com.icia.storeproject.service;

import com.icia.storeproject.dto.MemberSaveDTO;

public interface MemberService {
    //회원가입 처리
    Long save(MemberSaveDTO memberSaveDTO);
}
