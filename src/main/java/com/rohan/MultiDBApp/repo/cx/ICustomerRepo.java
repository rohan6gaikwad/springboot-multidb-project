package com.rohan.MultiDBApp.repo.cx;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rohan.MultiDBApp.entity.cx.Customer;
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

	
}
