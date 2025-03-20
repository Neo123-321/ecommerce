package com.example.Eapp.products;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;	
	@Column(name="pname")	
	String pname;
	@Column(name="price")
	int price;
	@Column(name="quantity")	
	int quantity;

	products()
	{
	super();	
	}
		products(String pname, int price, int quantity)
		{
			this.pname=pname;
			this.price=price;
			this.quantity=quantity;
		}
		products(int id,String name, String pname, int price, int quantity)
		{
			this.id=id;
			this.pname=pname;
			this.price=price;
			this.quantity=quantity;
		}

	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
