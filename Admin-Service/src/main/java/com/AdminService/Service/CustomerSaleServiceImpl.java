package com.AdminService.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.AdminService.DAO.CustomerSaleDao;
import com.AdminService.Entity.CustomerSale;

;


@Service
public class CustomerSaleServiceImpl implements CustomerSaleService {

	@Autowired
	CustomerSaleDao customerDao;
	
	@Override
	public CustomerSale addCustProduct(CustomerSale custproduct) {
		return customerDao.save(custproduct);
	}

}
