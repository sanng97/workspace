package edu.kh.project.board.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.kh.project.board.model.service.EditBoardService;
import edu.kh.project.member.model.dto.Member;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("editBoard")
@SessionAttributes({"loginMember"})
public class EditBoardController {

	
	private final EditBoardService service;
	
	
	/**
	 * 
	 * @param boardCode
	 * @param boardNo
	 * @param loginMember
	 * @return
	 */
	@GetMapping("{boardCode:[0-9]+}/{boardNo:[0-9]+}/delete")
	public String deleteBoard(
			@PathVariable("boardCode") int boardCode,
			@PathVariable("boardNo") int boardNo, 
		@SessionAttribute(value="loginMember", required = false) Member loginMember,
		
		RedirectAttributes ra,
		@RequestHeader("referer") String referer) {
			
		// 로그인 상태가 아닌 경우 삭제 진행 x
		if (loginMember == null) {
			ra.addAttribute("message","로그인 후 이용해주세요");
			return "redirect:/member/login";
		}
		
		// Map을 이용해서 boardCode,boardNo, memberNo 담기
		Map<String, Integer> paramMap = new HashMap<>();
		paramMap.put("boardCode", boardCode);
		paramMap.put("boardNo", boardNo);
		paramMap.put("memberNo", loginMember.getMemberNo());
		
		// 서비스 호출
		int result = service.deleteBoard(paramMap);
		
		
		String path = null;
		String message = null;
		
		if(result > 0) {
			message ="삭제 되었습니다";
			path = "redirect:/board/" +boardCode;
			
		}else {
			// 메인 페이지로 리다이렉트
			//path = "redirect:/";
			
			// 이전 요청 페이지로 리다이렉트
			path = "redirect:" + referer;
			
			message= "삭제실패";
		}
		ra.addFlashAttribute("message", message);
		
		return path;
	}
	
}

