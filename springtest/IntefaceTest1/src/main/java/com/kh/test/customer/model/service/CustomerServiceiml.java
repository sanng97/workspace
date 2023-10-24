package com.kh.test.customer.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.kh.test.customer.model.dto.Customer;

import com.kh.test.customer.model.mapper.CustomerMapper;


	//implements로 상속받기
	@Service

	public class CustomerServiceiml implements CustomerService {
	
	
	// 의존성 주입
	@Autowired

	private CustomerMapper mapper;

	// 부모타입 메서드 재정의
	@Override
	
	public int insertCustomer(Customer customer) {

	return mapper.insertCustomer(customer);

}

}