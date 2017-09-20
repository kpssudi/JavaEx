package pe3_2;

public class BankAccount {
	private double balance;
	
	public BankAccount(){
		balance = 0;
	}
	public BankAccount(double initBalance){
		balance = initBalance;
	}
	
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	public void addInterest(double rate){
		balance = balance + (balance * (rate/100));
	}
	public double getBalance(){		
		return balance;
	}
}
