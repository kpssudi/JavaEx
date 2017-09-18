package p3_2;
/**
 * Support computing sales tax in the CashRegister class. The tax rate should be supplied
when constructing a CashRegister object. Add recordTaxablePurchase and getTotal-
Tax methods. (Amounts added with recordPurchase are not taxable.) The giveChange
method should correctly reflect the sales tax that is charged on taxable items.
 * 
 *
 */
public class CashRegister1 {
	
	private double purchase;
	private double payment;
	private double tax_rate;
	
	public CashRegister1(double fix_tax_rate) {
		purchase = 0;
		payment = 0;
		tax_rate = fix_tax_rate;
	}
	public void recordPurchase(double amount){
		purchase = purchase + amount;		
	}
	public void receivePayment(double amount){
		payment = payment + amount;
	}
	public double giveChange(){
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}
