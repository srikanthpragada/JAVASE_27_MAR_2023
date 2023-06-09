package oop1;

import java.util.Objects;

public class Product {
	// instance variables
	private String name;
	private int price, qoh;
	// class variable 
	private static int taxrate = 12;

	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, int price, int qoh) {
		this(name, price); // call constructor
		this.qoh = qoh;
	}
	
	// invoked with classname 
	public static int getTaxrate() {
		return taxrate;
	}

	// Method
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.qoh);
	}

	public int getNetPrice() {
		return this.price + (this.price * taxrate / 100); // tax @ 12%
	}

	public void buy(int qty) {
		this.qoh += qty;
	}

	public void sell(int qty) {
		this.qoh -= qty;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", qoh=" + qoh + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name);
	}
	

}
