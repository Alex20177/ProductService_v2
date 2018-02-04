package com.test.product.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.test.product.dao.ProductDAO;
import com.test.product.dao.ProductImpl;
import com.test.product.dto.Product;

public class ProductImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao = new ProductImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Its Awesome!!");
		product.setPrice(800);
		
		dao.create(product);
		Product read = dao.read(1);
		
		assertNotNull(read);
		assertEquals("Iphone", read.getName());
		
	}//Close createShouldCreateAProduct method.

}//Close ProductImplTest class.
