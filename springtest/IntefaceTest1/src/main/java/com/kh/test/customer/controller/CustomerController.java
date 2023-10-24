package com.kh.test.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;

import com.kh.test.customer.model.dto.Customer;

import com.kh.test.customer.model.service.CustomerService;

@Controller // controller역할(요청/응답 제어) + bean 등록

public class CustomerController {

	// MemberService 의존성 주입
	@Autowired
	private CustomerService service;

	@PostMapping("insertCustomer")

	public String insertCustomer(Customer customer, Model model) {

		int result = service.insertCustomer(customer);

		// 로그인 성공 시

		if (result > 0)
			model.addAttribute("message", "추가 성공!!!");

		// 로그인 실패 시
		else
			model.addAttribute("message", "추가 실패...");

		// 결과값 반환
		return "result";

	}

}