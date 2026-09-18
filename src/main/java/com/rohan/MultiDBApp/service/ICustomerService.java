package com.rohan.MultiDBApp.service;

import java.util.List;

import com.rohan.MultiDBApp.entity.cx.Customer;



public interface ICustomerService{

	
	Customer addCx(Customer cx);
	List<Customer> getAllCx();
}
