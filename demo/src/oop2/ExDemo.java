package oop2;

public class ExDemo {

	public static void main(String[] args) {
		String st = "aa";

		try {
			int n = Integer.parseInt(st);
			System.out.println(99 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number -->" + ex.getMessage());
		} finally {
			System.out.println("Finally!!");
		}

		System.out.println("Done!");

	}

}
