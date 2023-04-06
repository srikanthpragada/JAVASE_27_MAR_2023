package oop1;

public class TestProduct {

	public static void main(String[] args) {
		Product p;  // object reference
		
		p = new Product();  // object 
		//p.name = "Abc";
		
		p.init("iPhone 14 Pro",120000);
		p.print(); 
		System.out.println(p.getNetPrice());
	}

}
