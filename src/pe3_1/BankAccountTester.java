package pe3_1;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(1000);
		myAccount.withdraw(500);
		myAccount.withdraw(400);
		double myBalance = myAccount.getBalance();
		System.out.printf("My Balance: %.2f\n", myBalance);
		System.out.println("Expected balance: 100.00");
	}
}
