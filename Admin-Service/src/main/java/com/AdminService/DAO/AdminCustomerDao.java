package com.AdminService.DAO;

import org.springframework.data.repository.CrudRepository;

import com.AdminService.Entity.AdminCustomer;





public interface AdminCustomerDao extends CrudRepository<AdminCustomer, Integer> {


//	Customer findByCustName(String custName);
}