package edu.kh.project.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.member.model.service.MemberService;
import lombok.extern.slf4j.Slf4j;

@Slf4j  //로그
@Controller //controller역할(요청/응답 제어) + bean 등록
@RequestMapping("member")
@SessionAttributes({"loginMember"})// 세션올리기
public class MemberController {

	// MemberService 의존성 주입
	@Autowired
	private MemberService service;
	
     //  / member/login(POST)
	
	@PostMapping("login")
	public String login (Member inputMember,
					Model model,RedirectAttributes ra){
		
		
		// 로그인 서비스 호출
		Member loginMember = service.login(inputMember);
		
		// 로그인 성공 시
		if(loginMember != null) {
			
			// 쿠키 생성 코드 작성 예정
		}
		
		// 로그인 실패 시
		if(loginMember == null) {
			ra.addFlashAttribute("message","아이디 또는 비밀번호가 일치하지 않습니다.");

		}
		
		// 로그인 결과를 session scope에 추가
		model.addAttribute("loginMember",loginMember);
		
		
		// 메인 페이지 리다이렉트
		return "redirect:/";
		
	}
	 
	
	 /** 로그아웃
    * @param status
    * @return
    */
   @GetMapping("logout")
   public String logout(SessionStatus status) {
      status.setComplete(); // @SessionAttributes session 만료
      return "redirect:/";
   }
   
   
   /** 로그인 전용 페이지 forward
    * @return "member/login"
    */
   @GetMapping("login")
   public String login() {
      return "member/login";
   }
   
   
   /** 회원가입 페이지 forward
    * @return
    */
   @GetMapping("signup")
   public String signup() {
      // templates/member/signup.html로 forward
      return "member/signup";
   }
   /**
    * 회원가입
    * @param inputMember : 파라미터가 저장된 커맨드 객체
    * @param memberAddress : 주소 입력 값이 저장된 배열 (가공예정)
    * @param ra : 리다이렉트 시 request scope로 값 전달
    * @return
    */
   
   @PostMapping("signup")
   public String signup(Member inputMember,
		   String[]memberAddress, RedirectAttributes ra) {
	   
	   // 회원가입 서비스 호출
	   int result = service.signup(inputMember,memberAddress);
	   
	   // 회원가입 성공 시
	   if(result >0) {
		   ra.addFlashAttribute("message","회원 가입 성공");
		   return "redirect:/"; // 메인페이지
	   }
	   // 회원 가입 실패
	   ra.addFlashAttribute("message","가입실패");
	   return "redirect:signup"; // 회원가입 페이지(상대경로 작성)
	   
   }
   
   //@PathVariable("key")
   // -경로(주소)를 변수에 값으로 사용하는 어노테이션
   
   /**
    * 빠른 로그인 (프로젝트 완성 후 삭제)
    * @param memberEmail : 주소 마지막 레벨 문자열(PathVariable)
    * @param model : 데이터 전달용 객체
    * @param ra: 리다이렉트 시 request scope로 데이터 전달
    * @return
    */
   @GetMapping("login/{memberEmail}")
   public String quickLogin(
		   @PathVariable("memberEmail") String memberEmail,
		   Model model ,RedirectAttributes ra) {
	   
	  // log.debug("memberEmail : " + memberEmail);
	   Member loginMember = service.quickLogin(memberEmail);
	   
	   if(loginMember == null ) {
		   ra.addFlashAttribute("message", "빠른 로그인 실패");
	   }
	    // 기본값 -> request scope
	   // @SessionAttributes({"loginMember"})-> session scope 이동
	   model.addAttribute("loginMember",loginMember);
	   
	   return "redirect:/";
	   
   }
   
   
   
   
   
   
   
   
}
