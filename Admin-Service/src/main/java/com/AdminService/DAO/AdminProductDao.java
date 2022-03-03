package com.AdminService.DAO;

import org.springframework.data.repository.CrudRepository;

import com.AdminService.Entity.AdminProduct;





public interface AdminProductDao extends CrudRepository<AdminProduct, Integer>  {
	
	
}
