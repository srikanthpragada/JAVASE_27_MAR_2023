package oop2;

import java.util.Scanner;

public class TotalNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;

		System.out.print("Enter numbers:");

		for (int i = 1; i <= 5; i++) {
			try {
				int n = Integer.parseInt(s.nextLine());
				total += n;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid Number!");
			}
		}

		System.out.println(total);
	}

}
