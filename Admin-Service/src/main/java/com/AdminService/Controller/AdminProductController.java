package com.AdminService.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AdminService.Entity.AdminProduct;
import com.AdminService.Service.AdminProductService;





@RestController
public class AdminProductController {

	@Autowired
	AdminProductService productService;
	
	@PostMapping("/addproduct")
	//@PostMapping(value = "/addcustomer",consumes= {MediaType.APPLICATION_JSON_VALUE},produces= {MediaType.APPLICATION_XML_VALUE})
	public AdminProduct addProduct(@RequestBody AdminProduct product) {
		
		return productService.addProduct(product);
		
	}
//	
//	@PutMapping("/updateprod")
//	public AdminProduct updateProduct(@RequestBody AdminProduct product) {
//		return productService.editProduct(product);
//
//	}
//
	@PutMapping("/updateprod")
	public AdminProduct updateCategory(@RequestBody AdminProduct product) {
	return this.productService.updateCategory(product);
	}

	@DeleteMapping("/DeleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") Integer id)
	{
		 productService.deleteById(id);
		 return "PRODUCT_DELETED";
	}
}


