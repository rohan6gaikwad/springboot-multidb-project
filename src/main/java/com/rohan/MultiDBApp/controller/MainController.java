package com.rohan.MultiDBApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.MultiDBApp.entity.cx.Customer;
import com.rohan.MultiDBApp.entity.pd.Product;
import com.rohan.MultiDBApp.service.ICustomerService;
import com.rohan.MultiDBApp.service.IProductService;

@RestController
public class MainController {

	@Autowired
	private ICustomerService service1;
	
	@Autowired
	private IProductService service2;
	
	
	@PostMapping("/add-cx")
	public ResponseEntity<Customer> addCx(@RequestBody Customer cx){
		 Customer dbcx = service1.addCx(cx);
		return new ResponseEntity<Customer>(dbcx,HttpStatus.CREATED);
		
	}
	
	@PostMapping("/add-pd")
	public ResponseEntity<Product> addPx(@RequestBody Product pd){
		 Product dbpd = service2.addPd(pd);
		return new ResponseEntity<Product>(dbpd,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/get-cx")
	public ResponseEntity<List> getCx(@RequestBody Customer cx){
		 List<Customer> dbcx = service1.getAllCx();
		return new ResponseEntity<List>(dbcx,HttpStatus.CREATED);
		
	}
	@GetMapping("/get-pd")
	public ResponseEntity<List> getPd(@RequestBody Product pd){
		 List<Product> dbpd = service2.getAllPd();
		return new ResponseEntity<List>(dbpd,HttpStatus.CREATED);
		
	}
	
	
}

