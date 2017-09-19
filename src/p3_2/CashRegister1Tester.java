package p3_2;

public class CashRegister1Tester {

	public static void main(String[] args) {
		CashRegister1 register1 = new CashRegister1(5);
		register1.recordPurchase(20.00);
		register1.recordTaxablePurchase(16.00);
		register1.recordTaxablePurchase(8.00);
		System.out.printf("Total Tax: %.2f\n", register1.getTotalTax());
		System.out.println("Expected Tax: 1.20");
		register1.receivePayment(50);
		double change = register1.giveChange();		
		System.out.printf("Change Returned: %.2f\n", change);
		System.out.println("Expected change: 4.80");
	}

}
