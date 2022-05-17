package com.skilllogic.productmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilllogic.productmanagement.model.Product;
import com.skilllogic.productmanagement.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute Product product) {
		int i = productService.saveProduct(product);
		ModelAndView modelAndView = new ModelAndView();
		if (i > 0) {
			modelAndView.setViewName("success");
		} else {
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}
}
