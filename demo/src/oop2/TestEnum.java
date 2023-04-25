package oop2;

enum PaymentMode {
	CASH, UPI, CARD
}

class Payment {
	int amount;
	PaymentMode mode;

	public Payment(int amount, PaymentMode mode) {
		super();
		this.amount = amount;
		this.mode = mode;
	}
}

public class TestEnum {

	public static void main(String[] args) {
		var p1 = new Payment(10000, PaymentMode.CARD);
		System.out.println(p1.mode);

		if (p1.mode == PaymentMode.CASH)
			;

	}

}
