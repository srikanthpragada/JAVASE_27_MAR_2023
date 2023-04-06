package oop1;

public class Product {
	// instance variables 
	private String name;
	private int price;

	// Methods
	public void init(String n, int p) {
		name = n;
		price = p;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
	
	public int getNetPrice() {
		 return price + (price * 12 / 100);  // tax @ 12%
	}

}
