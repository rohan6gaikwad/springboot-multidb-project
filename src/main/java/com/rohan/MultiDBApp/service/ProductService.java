package com.rohan.MultiDBApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohan.MultiDBApp.entity.pd.Product;
import com.rohan.MultiDBApp.repo.pd.IProduct;



@Service
public class ProductService implements IProductService {

	@Autowired
	private IProduct pro;
	
	@Override
	public Product addPd(Product pd) {
		
		return pro.save(pd);
	}

	@Override
	public List<Product> getAllPd() {
	
		return pro.findAll();
	}

}
