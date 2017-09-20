package r3_1;
//import BankAccount;
public class Tester {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		
		b1.deposit(500);
		b1.deposit(b2.getBalance());
		b2.deposit(b1.getBalance());
		//b.withdraw(b.getBalance() / 2);
		//double balance = b.getBalance();
		b1.mystery(b2, 500);
		System.out.println(b1.getBalance() + b2.getBalance());
		System.out.println(b1.getBalance() + " b2: " + b2.getBalance());
	}

}
