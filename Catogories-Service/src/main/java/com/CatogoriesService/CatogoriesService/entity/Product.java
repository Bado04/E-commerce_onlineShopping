package com.CatogoriesService.CatogoriesService.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.products.products.entity.Product;



	@Entity
	@Table(name="product")
	public class Product {
		
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		@Column(name = "id")
		private int id;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "type")
		private String type;
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="category_Id")
		private Category category;
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", type=" + type + "]";
		}
}
