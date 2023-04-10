package oop1;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account(1, "Jason");
		a.deposit(10000);
		a.deposit(20000);
		a.withdraw(5000);
		System.out.println(a.getBalance());
		System.out.println(a.getAcno());
		a.print();
		
		Account a2 = new Account(1, "Jason", 50000);
		 

	}

}
