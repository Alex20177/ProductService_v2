package com.test.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.test.product.dto.Product;

public class ProductImpl implements ProductDAO {

	Map<Integer, Product> products = new HashMap<>();
	
	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
	}//Close create method.

	@Override
	public Product read(int id) {
		return products.get(id);
	}//Close read method.

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
	}//Close update method.

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}//Close delete method.

}//Close ProductImpl class.
