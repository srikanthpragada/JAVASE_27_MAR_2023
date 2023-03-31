package basics;

import java.util.Scanner;

public class NetAmount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter product code [1-4]:");
		int code = s.nextInt();

		System.out.print("Enter quantity:");
		int qty = s.nextInt();

		int price = switch (code) {
			case 1 -> 500;
			case 2 -> 1500;
			case 3 -> 1800;
			default -> 3000;
		};
		
		int amount = price * qty;
		int discount;
		
		if (amount > 10000)
			discount = amount * 10 / 100;
		else
			discount = 0;
		
		int net_amount = amount - discount;
		
		System.out.printf("Amount       : %8d\n", amount);
		System.out.printf("- discount   : %8d\n", discount);
		System.out.printf("Net Amount   : %8d\n", net_amount);

	}

}
