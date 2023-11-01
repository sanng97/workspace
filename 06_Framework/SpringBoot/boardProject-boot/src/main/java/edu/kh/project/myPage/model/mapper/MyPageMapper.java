package edu.kh.project.myPage.model.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface MyPageMapper {

	int info(Member updateMember);
	
   /** 현재 비밀번호 찾기
    * @param memberNo
    * @return 
    */
   String findPw(int memberNo);
   
   String selectMemberPw(int memberNo);
   /** 비밀번호 변경
    * @param encPw
    * @param memberNo
    * @return result
    */
   int changePw(Map<String, Object> map);
   

   /**
    * 회원탈퇴
    * @param memberNo
    * @return
    */
   int secession(int memberNo);
   
   
   /**
    * 프로필 이미지 수정
    * @param loginMember
    * @return
    */
   int profile(Member loginMember);

  



	
	   


}
