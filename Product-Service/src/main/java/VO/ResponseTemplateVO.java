package VO;

import com.ProductService.entity.Product;

public class ResponseTemplateVO {
	private Product product;
	private Category category;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Category getCategory() {
		return category;
	}
	public ResponseTemplateVO(Product product, Category category) {
		super();
		this.product = product;
		this.category = category;
	}
	public ResponseTemplateVO() {
		super();
	
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	

}
