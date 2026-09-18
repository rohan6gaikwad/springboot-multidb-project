package com.rohan.MultiDBApp.repo.pd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohan.MultiDBApp.entity.pd.Product;
public interface IProduct extends JpaRepository<Product, Long> {
        
	
}
