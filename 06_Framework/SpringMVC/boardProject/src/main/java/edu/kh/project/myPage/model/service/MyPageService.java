package edu.kh.project.myPage.model.service;

import edu.kh.project.member.model.dto.Member;

public interface MyPageService {

	
	int info(Member updateMember, String[] memberAddress);

	int changePw(String currentPw, String newPw, int memberNo);
	
	/**
	 * 회원 탈퇴 서비스
	 * @param memberPw
	 * @param memberNo
	 * @return result (1: 성공 , 0: 실패)
	 */
	

	int secession(String memberPw, int memberNo);
	

	
}





