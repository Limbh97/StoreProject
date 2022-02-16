package com.icia.storeproject.repository;

import com.icia.storeproject.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    MemberEntity findByMemberId(String memberId);
}
