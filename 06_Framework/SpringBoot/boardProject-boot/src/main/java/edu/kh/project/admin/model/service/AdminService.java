package edu.kh.project.admin.model.service;

import java.util.List;

import edu.kh.project.member.model.dto.Member;

public interface AdminService {
	/**
	 * 이메일이 일치하는 회원정보 조회
	 * @param inputEmail
	 * @return searchMember
	 */

	Member selectMember(String inputEmail);
	
	
	/**
	 * 전체 회원 조회
	 * @return
	 */
	List<Member> selectAll();

	/**
	 * 전체 회원 조회 (+정렬)
	 * @param sort
	 * @return memberList
	 */
	List<Member> selectSort(int sort);
	
	
	/**
	 * 회원 탈퇴 복구
	 * @param memberNo
	 * @return
	 */

	int restoration(int memberNo);

	
	/**
	 * 관리자로 변경
	 * @param enrollDate
	 * @return
	 */
	int changeAuthority(int memberNo);

	/**
	 * 비밀번호 초기화
	 * @param memberNo
	 * @return
	 */
	int initPw(int memberNo);

	


	
}
