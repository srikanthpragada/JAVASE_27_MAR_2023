package oop2;

public class AssertDemo {

	public static boolean isEven(int n) {
		return n / 2 == 0;
	}

	public static void main(String[] args) {
		System.out.println("Testing started!");
		
		assert isEven(0) == true : "Error in isEven --> false when true is expected";
		assert isEven(1) == false : "Error in isEven --> true when false is expected";
		
		System.out.println("Testing Completed!");
	}

}
