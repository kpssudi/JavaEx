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
	private double total_tax;
	
	public CashRegister1(double fix_tax_rate) {
		purchase = 0;
		payment = 0;
		total_tax = 0;
		tax_rate = fix_tax_rate;
	}
	public void recordTaxablePurchase(double amount){
		double tax = (amount*(tax_rate/100));
		total_tax = total_tax + tax;
		purchase = purchase + amount + tax;
	}
	public double getTotalTax(){
		return total_tax;
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
