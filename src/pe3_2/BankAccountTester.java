package pe3_2;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(1000);
		myAccount.addInterest(10);
		double myBalance = myAccount.getBalance();
		System.out.printf("My Balance: %.2f\n", myBalance);
		System.out.println("Expected balance: 1100.00");
	}
}
