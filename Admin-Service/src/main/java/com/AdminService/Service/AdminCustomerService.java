package com.AdminService.Service;

import java.util.List;

import com.AdminService.Entity.AdminCustomer;






public interface AdminCustomerService {
	public List<AdminCustomer> getAllCustomer();
	public AdminCustomer addCustomer(AdminCustomer customer);
	//public List<Customer> getAllDetails();
	//public Boolean addDetails();
//	public Customer addCustomerProduct(Customer customer);
}