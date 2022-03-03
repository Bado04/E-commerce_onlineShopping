package com.AdminService.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AdminService.Entity.AdminCustomer;
import com.AdminService.Service.AdminCustomerService;




@RestController
public class AdminCustomerController {

	@Autowired
	AdminCustomerService customerService;
	
	
	//@GetMapping(value="/customers",produces= {MediaType.APPLICATION_XML_VALUE})
	@GetMapping("/customers")
	public List<AdminCustomer> getAllCustomer(){
		List<AdminCustomer> customerList= customerService.getAllCustomer();
		//return customerService.getAllCustomer();
	    return customerList;
	}
	
	@PostMapping("/addcustomers")
	//@PostMapping(value = "/addcustomer",consumes= {MediaType.APPLICATION_JSON_VALUE},produces= {MediaType.APPLICATION_XML_VALUE})
	public AdminCustomer addCustomer(@RequestBody AdminCustomer customer) {
		
		return customerService.addCustomer(customer);
		
	}


}
