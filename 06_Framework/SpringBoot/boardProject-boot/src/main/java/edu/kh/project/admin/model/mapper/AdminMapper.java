package edu.kh.project.admin.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface AdminMapper {

	Member selectMember(String inputEmail);
	
	
	
	/**
	 * 전체 회원 조회
	 * @return
	 */

	// Mapper 메서드 반환형이 List로 작성되어 있으면
	// 마이바티스 수행 시 조회되는 모든 행을
	// 자동으로 List에 추가(add)
	// 단 조회 결과가 없을 경우 비어 있는 list (0칸)가 반환
	
	List<Member> selectAll();


	/**
	 * 전체 회원 조회 (+정렬)
	 * @param query
	 * @return memberList
	 */
	List<Member> selectSort(String query);

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
	 * @param map
	 * @return result
	 */
	int initPw(Map<String, Object> map);






	
	



	

	


	
	
}
