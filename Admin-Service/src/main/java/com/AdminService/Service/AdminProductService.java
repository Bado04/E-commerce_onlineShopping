package com.AdminService.Service;

import com.AdminService.Entity.AdminProduct;

public interface AdminProductService {
	
	 public AdminProduct addProduct(AdminProduct product);
	    // public void deleteProduct(String prodName);
	   //  public AdminProduct editProduct(AdminProduct product);
	     public void deleteById(Integer id);
		public AdminProduct getProductsById(long productId);
		public AdminProduct updateCategory(AdminProduct product);
}
