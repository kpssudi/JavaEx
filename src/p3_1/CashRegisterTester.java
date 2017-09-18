package p3_1;

public class CashRegisterTester {

	public static void main(String[] args) {
		CashRegister register = new CashRegister();
		register.recordPurchase(19.50);
		register.recordPurchase(5.60);
		int count = register.getItemCount();
		System.out.println("Item(s) purchased: " + count);
	}

}
