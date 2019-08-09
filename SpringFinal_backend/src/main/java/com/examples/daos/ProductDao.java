package com.examples.daos;

import com.examples.models.Product;

public interface ProductDao {
	
	public boolean addProducts(Product p);
	
	public String viewProducts(Product p);

}
