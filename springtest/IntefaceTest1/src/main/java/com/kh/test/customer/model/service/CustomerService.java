package com.kh.test.customer.model.service;

import com.kh.test.customer.model.dto.Customer;

public interface CustomerService {

	int customer(Customer inputcustomer, String[] customerAddress);

}
