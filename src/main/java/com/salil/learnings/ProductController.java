package com.salil.learnings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;

	@GetMapping(value = "/products")
	public List<Product> getProduct() {
		List<Product> products = productService.findAll();
		System.out.println("Products : "+products);
		return products;
	}

	@PostMapping(value = "/products")
	public String addProduct(@RequestBody Product product) {

		productService.addProduct(product);

		return "New Product added";
	}

}
