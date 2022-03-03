package com.ProductService.Contoller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProductService.entity.Product;
import com.ProductService.services.ProductService;

import VO.ResponseTemplateVO;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/save")
	public String save(@RequestBody Product product) {
		service.save(product);
		return "PRODUCT_ADDED_SUCCESSFULLY!!";
		
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getproduct(@PathVariable("id") int id) {
		return service.getProducts(id);
	}
	
	

}
