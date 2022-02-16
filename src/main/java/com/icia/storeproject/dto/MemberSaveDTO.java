package com.icia.storeproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberSaveDTO {
    private String MemberId; //아이디
    private String MemberPassword; //비밀번호
    private String MemberName; //이름
    private String MemberBirth; //생년월일
    private String MemberArea; //주소
    private String MemberPhone; //전화번호
    private String MemberEmail; //이메일
}
