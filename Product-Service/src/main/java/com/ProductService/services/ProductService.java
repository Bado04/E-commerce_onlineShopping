package com.ProductService.services;






import com.ProductService.entity.Product;

import VO.ResponseTemplateVO;

public interface ProductService {
	
	public  ResponseTemplateVO getProducts(int id);

	public void save(Product product);

}
