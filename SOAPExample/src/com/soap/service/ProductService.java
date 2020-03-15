package com.soap.service;

import com.soap.model.Product;

public interface ProductService {

	public boolean addProduct(Product p);
	
	public boolean deleteProduct(int id);
	
	public Product getProduct(int id);
	
	public Product[] getAllProducts();
}
