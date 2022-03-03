package com.AdminService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Table")
public class AdminProduct {

	@Id
	@Column
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prodid;
	private String  prodName;
	private Long prodPrice;
	private Integer productQuantity;
	private String productImage;
	public Integer getProdId() {
		return prodid;
	}
	public void setId(Integer prodid) {
		this.prodid = prodid;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Long getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Long prodPrice) {
		this.prodPrice = prodPrice;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	
	}


