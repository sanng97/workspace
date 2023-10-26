package edu.kh.project.admin.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.project.member.model.dto.Member;

public interface AjaxService {
	
	/**
	 * 회원번호로 이메일 조회
	 * @param memberNo
	 * @return email
	 */
	String selectMemberNo(int memberNo);

	String selectEmail(String inputEmail);

	Member selectMember(int no);

	List<String> selectEmailList(String keyword);
	/**
	 * 모든 회원 정보 조회
	 * @return
	 */
	List<Member> selectAll();
	
	/**
	 * 샘플계정가입
	 * @param member
	 * @return
	 */

	int insertMember(Member member);
	
	/**
	 * 탈퇴 여부 변경
	 * @param paramMap
	 * @return
	 */
	int updateFlag(Map<String, Object> paramMap);
	



	
}
