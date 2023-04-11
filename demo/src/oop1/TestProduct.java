package oop1;

public class TestProduct {

	public static void main(String[] args) {
		
		System.out.println(Product.getTaxrate());
		
		Product p;  // object reference
		p = new Product("Airpods", 30000);  // object 
		p.buy(10);
		p.sell(5);
		p.print(); 
		System.out.println(p.getNetPrice());
		
		
		
		 
		 
	}

}
