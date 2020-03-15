package com.soap.model;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = -5577579081118070434L;
	
	private String name;
	private int qty;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		
		return id+"::"+name+"::"+qty+"::";
	}
	
	

}
