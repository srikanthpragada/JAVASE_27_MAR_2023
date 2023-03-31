package basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		// take number from user
		Scanner s = new Scanner(System.in); // scan from keyboard 
		System.out.print("Enter number :");
		var num = s.nextInt();  // read int from keyboard

		var square = num * num;
		System.out.println(square);

	}

}
