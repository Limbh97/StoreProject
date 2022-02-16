package com.icia.storeproject.service;

import com.icia.storeproject.dto.MemberLoginDTO;
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
    //중복체크
    @Override
    public String idDp(String memberId) {
        MemberEntity idCheckResult = mr.findByMemberId(memberId);
        if(idCheckResult == null){
            return "ok";
        }else {
            return "no";
        }

    }

    //로그인 처리
    @Override
    public boolean login(MemberLoginDTO memberLoginDTO) {
        MemberEntity memberEntity = mr.findByMemberId(memberLoginDTO.getMemberId());
        if(memberEntity != null) {
            if (memberEntity.getMemberPassword().equals(memberLoginDTO.getMemberPassword())) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }
}
