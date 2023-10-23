package com.kh.test.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.test.customer.model.dto.Customer;
import com.kh.test.customer.model.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("customer")
@SessionAttributes({"CustomerMember"})


public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	   @PostMapping("customer")
	   public String signup(Customer inputcustomer,
			   String[]customerAddress, RedirectAttributes ra) {
		
		   int result = service.customer(inputcustomer,customerAddress);
		   
		 
		   if(result >0) {
			   ra.addFlashAttribute("message","홍길동 고객님 추가 성공");
			   return "redirect:/"; // 메인페이지
		   }
		return null;
		   
	   

	   }
}

	   
