package oop1;

public class Account {
    private int acno;
    private String ahname;
    private double balance;
    private static int minbal = 5000;
    
    public static int getMinbal() {
    	return minbal;
    }
    // constructor 
    public Account(int acno, String ahname) {
    	this.acno = acno;
    	this.ahname = ahname;
    }
    
    public Account(int acno, String ahname, double balance) {
    	this(acno,ahname);
    	this.balance = balance;
    }
    
    // Methods 
    public void print() {
    	System.out.println(this.acno);
    	System.out.println(this.ahname);
    	System.out.println(this.balance);
    }
    
    public void deposit(double amount) {
    	this.balance += amount;
    }
    public void withdraw(double amount) {
    	if(this.balance - Account.minbal >= amount)
    		balance -= amount;
    }
    
    public double getBalance() {
    	return this.balance; 
    }
    public double getAcno() {
    	return this.acno; 
    }
}
