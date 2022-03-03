package com.AdminService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerSale {
	
	@Id
	@Column
	private Integer cId;
	private String cName;
	private Long cPrice;
	private Integer cQuantity;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Long getcPrice() {
		return cPrice;
	}
	public void setcPrice(Long cPrice) {
		this.cPrice = cPrice;
	}
	public Integer getcQuantity() {
		return cQuantity;
	}
	public void setcQuantity(Integer cQuantity) {
		this.cQuantity = cQuantity;
	}

}
