package com.rohan.MultiDBApp.service;


import java.util.List;

import com.rohan.MultiDBApp.entity.pd.Product;


public interface IProductService {



	
	Product addPd(Product pd);
	List<Product> getAllPd();

	
}
