package edu.kh.project.myPage.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.mapper.MyPageMapper;

@Transactional
@Service
public class MypageServiceImpl implements MyPageService {

	@Autowired
	private MyPageMapper mapper;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Override
	public int info(Member updateMember, String[] memberAddress) {
		// 주소 가공
		
		if(updateMember.getMemberAddress().equals(",,")) {
			updateMember.setMemberAddress(null);
		
		}else { // 주소를 입력한 경우 배열 -> 문자열로 합쳐서 inputMember에 추가
			String address = String.join("^^^", memberAddress);
			updateMember.setMemberAddress(address);
		}
		// mapper 호출 후 결과 반환
		return mapper.info(updateMember);
	}
	
	
	   /** 비밀번호 변경
    *
    */
   @Override
   public int changePw(String newPw, String currentPw, int memberNo) {

      // 1. 로그인한 회원의 비밀번호 조회
      // 현재 비밀번호 일치하는지 확인
      // 현재 비밀번호 DB에서 얻어오기
      String currentPw2 = mapper.findPw(memberNo); 
      
      // 2. 현재 비밀번호와 조회한 비밀번호 비교
      // 현재 비밀번호가 불일치한다면
      if(!bcrypt.matches(currentPw, currentPw2)) { // 같지 않다
         return 0;
      }
      
      
      // 3. 현재 비밀번호 일치한다면 새 비밀번호 변경
      // (주의사항) 마이바티스 코드의 파라미터는 1개만 가능!
      // -> 현재 newPw(암호화), memberNo 두개가 필요
      //  묶어서 해결!(Map, DTO)
      // 새로운 비밀번호 암호화 작업
      String encPw = bcrypt.encode(newPw);
      
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("encPw", encPw);
      map.put("memberNo", memberNo);
      
      // 비밀번호 변경 
      return mapper.changePw(map);
   }
     	@Override
     	public int secession(String memberPw, int memberNo) {

     		// 로그인한 회원의 암호화된 비밀번호 조회
     		String encPw= mapper.selectMemberPw(memberNo);
     		
     		if(!bcrypt.matches(memberPw, encPw)) {
     			
     			return 0;
     		}
     		
     		// 탈퇴처리 sql 수행
     		return mapper.secession(memberNo);
     	}
	
}
