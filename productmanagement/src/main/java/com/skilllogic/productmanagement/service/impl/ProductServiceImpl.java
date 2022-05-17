package com.skilllogic.productmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilllogic.productmanagement.dao.ProductDao;
import com.skilllogic.productmanagement.model.Product;
import com.skilllogic.productmanagement.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public int saveProduct(Product product) {
		int i = productDao.saveProduct(product);
		return i;
	}
}
