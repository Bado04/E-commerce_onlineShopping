package com.RegistrationService.Registration_Service;

import com.RegistrationService.Entity.Customer;

public interface RegistrationService {
	public String addCust(Customer customer);

	//public String login(String email, String password);
	public Customer custLogin(String custEmail,String password);

}
