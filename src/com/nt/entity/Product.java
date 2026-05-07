package com.nt.entity;

public class Product {
       private int id;
       private String name;
       private float price;
       private int qty;
       private String qlty;
       private String man_date;
       private String exp_date;
       
	@Override
	public String toString() {
		return id+" "+name+" "+price+" "+qty+" "+qlty+" "+man_date+" "+exp_date;
	}
	public Product(int id, String name, float price, int qty, String qlty, String man_date, String exp_date) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.qlty = qlty;
		this.man_date = man_date;
		this.exp_date = exp_date;
	}
	public Product() {}
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getQlty() {
		return qlty;
	}
	public void setQlty(String qlty) {
		this.qlty = qlty;
	}
	public String getMan_date() {
		return man_date;
	}
	public void setMan_date(String man_date) {
		this.man_date = man_date;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
       
       
}
