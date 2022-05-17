package com.skilllogic.productmanagement.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.skilllogic.productmanagement.dao.ProductDao;
import com.skilllogic.productmanagement.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int saveProduct(Product product) {
		int i =jdbcTemplate.update("insert into product_details(prod_name,prod_qty,prod_price,prod_desc) values(?,?,?,?)", 
				product.getProductName(),product.getProductQty(),product.getProductPrice(),product.getProductDesc());
		return i;
	}

}
