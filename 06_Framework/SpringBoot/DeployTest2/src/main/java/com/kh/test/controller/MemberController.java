package com.kh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class MemberController {
	
	@GetMapping("check")
	
	   public String loginTest(@RequestParam("id") String id, Model model  ) {
	
		if(id.equals("user01") ) {
			
			
			 model.addAttribute("message" , "이미 사용 중인 아이디 입니다");
			
			
		}else {
			 model.addAttribute("message" , "사용 가능한 아이디 입니다");
			
		}
		 
		   return "checkResult";
	   }

	

}


