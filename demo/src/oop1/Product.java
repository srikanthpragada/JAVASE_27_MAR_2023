package oop1;

public class Product {
	// instance variables 
	private String name;
	private int price, qoh;

	// Constructor
	public Product(String n, int p) {
		name = n;
		price = p;
	}
    // Method
	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(qoh);
	}
	
	public int getNetPrice() {
		 return price + (price * 12 / 100);  // tax @ 12%
	}
	
	public void buy(int qty) {
		 qoh += qty;
	}

	public void sell(int qty) {
		 qoh -= qty;
	}

}
