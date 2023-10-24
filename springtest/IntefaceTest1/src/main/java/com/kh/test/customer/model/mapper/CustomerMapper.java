package com.kh.test.customer.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kh.test.customer.model.dto.Customer;


// 인터페이스의 메서드명과 mapper.xml에 작성된 태그 아이디가 같은것끼리 연결
@Mapper

public interface CustomerMapper {

	int insertCustomer(Customer customer);

}