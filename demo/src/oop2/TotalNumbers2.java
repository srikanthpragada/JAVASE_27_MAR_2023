package oop2;

import java.util.Scanner;

public class TotalNumbers2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0, total = 0;

		System.out.print("Enter numbers:");

		while(count < 5) {
			try {
				int n = Integer.parseInt(s.nextLine());
				total += n;
				count ++;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid Number!");
			}
		}

		System.out.println(total);
	}

}
