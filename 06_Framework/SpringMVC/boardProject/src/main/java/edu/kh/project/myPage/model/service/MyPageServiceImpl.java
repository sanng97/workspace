package edu.kh.project.myPage.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.dao.MyPageDAO;

// service : 비즈니스 로직 처리 (데이터 가공 , DB연결, 트랜잭션 제어)


@Service // service 역할 + bean 등록
public class MyPageServiceImpl implements MyPageService  {

	@Autowired  //MyPageDAO (또는 상속관계 ) bean 을 DI(의존성 주입)
	private MyPageDAO dao;
	
	@Autowired // spring-security.xml 참고
	private BCryptPasswordEncoder bcrypt;
	
	
	
	/**
	 * 내 정보 수정 서비스
	 * @param updateMember
	 * @param memberAddress
	 * @return result (1: 성공 ,0 :실패)
	 */
	
	// 정상 수행 시 commit , 예외 발생 시 rollback
	@Transactional(rollbackFor = Exception.class)
	@Override
	public int info(Member updateMember, String[] memberAddress) {
		
		//1) memberAddress 가공 처리
		// 주소를 입력하지 않은 경우
		
	if(updateMember.getMemberAddress().equals(",,")) {
		updateMember.setMemberAddress(null);
	} else {
		String addr = String.join("^^^",memberAddress);
		updateMember.setMemberAddress(addr);
	}
		
		// 2) dao 호출 후 결과를 반환받아
	    // 바로 controller 로 반환
	return dao.info(updateMember);
	
	}	
	@Override
		public int changePw(String currentPw, String newPw, int memberNo) {
			
		//1. 로그인한 회원의 암호화된 비밀번호 조회 (SELECT)
		
		String encPw = dao.selectMemberPw(memberNo);
				
		
		// 2.현재 비밀번호와 조회한 비밀번호가 같은지 확인
		// 같으면 -> 비밀번호 변경
		// 다르면 -> return 0
		
		// BCrypt에서 제공하는 matches() 이용
		if(!bcrypt.matches(currentPw, encPw)) {
			// 현재 비밀번호와 조회한 비밀번호가 다른 경우
			return 0;
		}
		
		
		// 3. 비밀번호 변경 DAO 메서드 호출 전
		// newPw,memberNo를 하나의 객체에 저장
		// 왜,? 마이 바티스 코드는 파라미터를 하나만 전달가능
		
		Map<String,Object> map = new HashMap<String, Object>();
		
		map.put("newPw", bcrypt.encode(newPw));// 새 비밀번호 암호화
		map.put("memberNo", memberNo);
		
		
		// 4. DAO 메서드 호출 후 반환된 결과를
		// CONTRLLER로 반환 + Transactional
		return dao.changePw(map);

	}	
	
	
		@Transactional(rollbackFor = Exception.class)
		@Override
		public int secession(String memberPw, int memberNo) {	
			
			// 입력 받은 비밀번호가
			// DB에 저장된 로그인한 회원의 비밀번호와 같다면
			// 회원 탈퇴 수행 후 결과 반환
			String encPw = dao.selectMemberPw(memberNo);

			if(!bcrypt.matches(memberPw, encPw)){ // 다르면

				return 0;
			}
			
			return dao.secesseion(memberNo);
			
			
			
		}

		
}	
	
	

