package edu.kh.project.admin.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface AjaxMapper {

	public String selectMemberNo(int memberNo);

	public String selectEmail(String inputEmail);

	public Member selectMember(int no);
	
	/**
	 * 일부 일치하는 이메일 모두 조회
	 * @param keyword
	 * @return emailList
	 */

	public List<String> selectEmailList(String keyword);

	
	/**
	 * 모든 회원 정보 조회
	 * @return memberList
	 */
	public List<Member> selectAll();
	
	/**
	 * 탈퇴여부 수정
	 * @param paramMap
	 * @return
	 */

	public int updateFlag(Map<String, Object> paramMap);


	
}
