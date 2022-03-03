package com.AdminService.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.AdminService.DAO.AdminProductDao;
import com.AdminService.Entity.AdminProduct;





@Service
public class AdminProductServiceImpl implements AdminProductService{

	@Autowired
	AdminProductDao productDao;
	
	@Override
	public AdminProduct addProduct(AdminProduct product) {
		return productDao.save(product);
	}

//	@Override
//	public AdminProduct editProduct(AdminProduct product) {
//		Integer productId = product.getProdId();
//		AdminProduct pd = productDao.findById(productId).get();
//		
//		pd.setProdPrice(product.getProdPrice());
//		pd.setProductQuantity(product.getProductQuantity());
//		return productDao.save(pd);
//	}
//	

	@Override
	public AdminProduct updateCategory(AdminProduct product) {
	// TODO Auto-generated method stub
	return this.productDao.save(product);
	}


	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		productDao.deleteById(id);
		
	}

	@Override
	public AdminProduct getProductsById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public Product updateProduct(Product product) {

		Integer productId = product.getProdId();
		Product pd = productDao.findById(productId).get();

		pd.setProdPrice(product.getProdPrice());
		pd.setProdQuantity(product.getProdQuantity());

		return productDao.save(pd);

	}*/

}

