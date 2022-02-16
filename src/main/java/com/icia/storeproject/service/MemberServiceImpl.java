package com.icia.storeproject.service;

import com.icia.storeproject.dto.MemberSaveDTO;
import com.icia.storeproject.entity.MemberEntity;
import com.icia.storeproject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository mr;

    //회원가입 처리
    @Override
    public Long save(MemberSaveDTO memberSaveDTO) {
        MemberEntity memberEntity = MemberEntity.MemberSave(memberSaveDTO);
        System.out.println("MemberServiceImpl.save");
        return mr.save(memberEntity).getMemberNumber();
    }
}
