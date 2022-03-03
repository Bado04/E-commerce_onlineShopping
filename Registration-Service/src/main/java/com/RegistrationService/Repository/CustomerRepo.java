package com.RegistrationService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;

import com.RegistrationService.Entity.Customer;



public interface CustomerRepo extends JpaRepository<Customer, Integer>, CrudRepository<Customer, Integer>{

	Customer findByCustEmail(String custEmail);

}
