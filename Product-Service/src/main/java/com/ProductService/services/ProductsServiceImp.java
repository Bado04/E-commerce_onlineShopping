package com.ProductService.services;



import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ProductService.entity.Product;
import com.ProductService.repository.ProductRepo;

import VO.Category;
import VO.ResponseTemplateVO;


@Service
public class ProductsServiceImp implements ProductService {
	
	@Autowired
	public ProductRepo  productrepo;
	
	@Autowired
	public RestTemplate restTemplate;


	@Override
	public void save(Product product) {

		productrepo.save(product);
		
	}


	@Override
	public ResponseTemplateVO getProducts(int id) {

	  ResponseTemplateVO vo= new ResponseTemplateVO();
	  
	  Product product = productrepo.findByid(id);
	  
	  
	  Category category = 
			  restTemplate.getForObject("http://localhost:9091/category/"+ product.getCategoryId(),Category.class);
	  
			  vo.setProduct(product);
			  vo.setCategory(category);
			  return vo;
	}

}
