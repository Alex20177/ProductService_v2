package com.test.product.bo;

import com.test.product.dto.Product;

public interface ProductBO {

	public void create(Product product);
	
	public Product findProduct(int id);
	
}//Close ProductBO interface
