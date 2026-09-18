package com.rohan.MultiDBApp.entity.pd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
   
	
	@Id
	private Long id;
	
	private String pname;
	
	private Double pcost;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPcost() {
		return pcost;
	}

	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	
	
	
}
