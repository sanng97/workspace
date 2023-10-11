package edu.kh.project.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// java 객체 : new 연산자에 의해서 class 내용대로 heap영역에 생성됨
// instance : 개발자가 만들고 관리하는 객체
// bean : Spring (spring container)이 만들고 관리하는 객체

@Controller //bean 등록 + controller 역할을 할것이라고 명시
            // controller 역할: 
public class MainController {

	// "/"로 요청을 받게되면
	@RequestMapping("/")
	public String mainPage() {
		
		return"common/main";
		//-> /WEB-INF/views/common/main.jsp로 forward
		
	}
	
}
