package oop1;

public class Account {
    private int acno;
    private String ahname;
    private double balance;
    // constructor 
    public Account(int no, String name) {
    	acno = no;
    	ahname = name;
    }
    
    public Account(int no, String name, double bal) {
    	acno = no;
    	ahname = name;
    	balance = bal;
    }
    
    // Methods 
    public void print() {
    	System.out.println(acno);
    	System.out.println(ahname);
    	System.out.println(balance);
    }
    
    public void deposit(double amount) {
    	balance += amount;
    }
    public void withdraw(double amount) {
    	balance -= amount;
    }
    public double getBalance() {
    	return balance; 
    }
    public double getAcno() {
    	return acno; 
    }
}
