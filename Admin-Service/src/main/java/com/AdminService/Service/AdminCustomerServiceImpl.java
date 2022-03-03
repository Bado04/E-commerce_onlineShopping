package com.AdminService.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminService.DAO.AdminCustomerDao;
import com.AdminService.Entity.AdminCustomer;



@Service
public class AdminCustomerServiceImpl implements AdminCustomerService{

	@Autowired
	AdminCustomerDao customerDao;
	@Override
	public List<AdminCustomer> getAllCustomer(){
		return (List<AdminCustomer>) customerDao.findAll();
	}
	
	@Override
	public AdminCustomer addCustomer(AdminCustomer customer) {
		return customerDao.save(customer);
	}

//	@Override
//	public Customer addCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		return null;
	}


