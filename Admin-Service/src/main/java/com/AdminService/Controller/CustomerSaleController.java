package com.AdminService.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AdminService.Entity.CustomerSale;
import com.AdminService.Service.CustomerSaleService;




@RestController
public class CustomerSaleController {

	@Autowired
	CustomerSaleService custSaleService;

	@PostMapping("/addCustproduct")
	public CustomerSale addProduct(@RequestBody CustomerSale custproduct) {
		return custSaleService.addCustProduct(custproduct);
	}
}

