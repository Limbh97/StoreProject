package com.icia.storeproject.entity;

import com.icia.storeproject.dto.MemberSaveDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "m_table")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberNumber")
    private Long memberNumber; //회원번호

    @Column(length = 20, unique = true)
    private String memberId; //아이디

    @Column(length = 20)
    private String memberPassword; //비밀번호

    @Column(length = 20)
    private String memberName; //이름

    @Column(length = 20)
    private String memberBirth; // 생년월일

    @Column(length = 50)
    private String memberArea; //주소

    @Column(length = 20)
    private String memberPhone; //전화번호

    @Column(length = 20)
    private String memberEmail; //이메일

    public static MemberEntity MemberSave(MemberSaveDTO memberSaveDTO) {
        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setMemberId(memberSaveDTO.getMemberId());
        memberEntity.setMemberPassword(memberSaveDTO.getMemberPassword());
        memberEntity.setMemberName(memberSaveDTO.getMemberName());
        memberEntity.setMemberBirth(memberSaveDTO.getMemberBirth());
        memberEntity.setMemberArea(memberSaveDTO.getMemberArea());
        memberEntity.setMemberPhone(memberSaveDTO.getMemberPhone());
        memberEntity.setMemberEmail(memberSaveDTO.getMemberEmail());
        return memberEntity;
    }
}
