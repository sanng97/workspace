package edu.kh.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value = "/view1", method = RequestMethod.GET)
	public String home1() {
		// forward 또는 redirect 때문에
		// controller 메서드 반환형은 대부분 string
		
		
		
		
		
		/* spring 에서 forward 하는 방법*/
		//  forward 할 jsp 경로에서
		// viewResolver의 prefix, suffix  부분을 제외한 경로
		// return 으로 값을예정
		return  "home/view1";
	}
		
	
	@RequestMapping(value = "/view2", method = RequestMethod.GET)
	public String home2() {
		return "home/view2";
	}
		
}
