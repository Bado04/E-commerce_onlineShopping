package com.RegistrationService.controller;


	import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RegistrationService.Entity.Customer;
import com.RegistrationService.Registration_Service.RegistrationService;


	


	@CrossOrigin
	@RestController
//	@RequestMapping("/registration")
	public class RegistrationController {

		@Autowired
		private RegistrationService rs;

		@PostMapping(value="/addcustomer")
		public String addCust(@RequestBody Customer customer) {

			return rs.addCust(customer);

		}

		
		@PostMapping(value="/customerlogin")
		public Customer custLogin(@RequestBody Customer customer){
			Customer cust=rs.custLogin(customer.getCustEmail(),customer.getPassword());
			ResponseEntity<Customer> res=new ResponseEntity<>(cust,HttpStatus.OK);
			return cust;
		}
		
	}


