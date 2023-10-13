package edu.kh.project.myPage.model.dao;

import java.util.Map;

import edu.kh.project.member.model.dto.Member;

//인터페이스 사용 이유 : 규칙성 부여, 결합도 약화

public interface MyPageDAO {
	
	/** 회원 정보 수정
	 * 
	 */

	int info(Member updateMember);
	
	String selectMemberPw(int memberNo);
	

	int changePw(Map<String, Object> map);

	int secesseion(int memberNo);

	
	
}
