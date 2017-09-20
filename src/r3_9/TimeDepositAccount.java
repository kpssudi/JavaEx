package r3_9;
/**
 * Suppose you want to implement a class TimeDepositAccount. A time deposit account
has a fixed interest rate that should be set in the constructor, together with the initial
balance. Provide a method to get the current balance. Provide a method to add the
earned interest to the account. This method should have no arguments because the
interest rate is already known. It should have no return value because you already
provided a method for obtaining the current balance. It is not possible to deposit
additional funds into this account. Provide a withdraw method that removes the entire
balance. Partial withdrawals are not allowed.
 */
public class TimeDepositAccount {
	
	private double rate;
	private double balance;

	public TimeDepositAccount(double init_balance, double int_rate){
	
		balance = init_balance;
		rate = int_rate;
	}
	public double getBalance(){
		return balance;
	}
	public void earned_interest(){
		balance = balance + ((balance * rate)/100);
	}
	public void withdraw(){
		balance = 0;
	}
}
