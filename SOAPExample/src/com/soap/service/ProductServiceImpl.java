package com.soap.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.soap.model.Product;

public class ProductServiceImpl implements ProductService {
	
	private static Map<Integer,Product> products = new HashMap<Integer,Product>();

	@Override
	public boolean addProduct(Product p) {
		if(products.get(p.getId()) != null) 
		return false;
		products.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deleteProduct(int id) {
		if(products.get(id) == null)
		return false;
		products.remove(id);
		return true;
		
	}

	@Override
	public Product getProduct(int id) {
		return products.get(id);
	}

	@Override
	public Product[] getAllProducts() {
		Set<Integer> ids = products.keySet();
		Product[] p = new Product[ids.size()];
		int i = 0;
		for(Integer id : ids) {
			p[i] = products.get(id);
			i++;
		}
		return p;
	
	}

}
