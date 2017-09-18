package p3_1;
/**
 * Enhance the CashRegister class so that it counts the purchased items. Provide a get-
ItemCount method that returns the count.
 * 
 *
 */
public class CashRegister {
/**
 * Constructs a cash register with no money in it.
 */
	private double purchase;
	private double payment;
	private int item_count;

	public CashRegister() {
		purchase = 0;
		payment = 0;
		item_count = 0;
	}
	public void recordPurchase(double amount){
		purchase = purchase + amount;
		item_count++;
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
	public int getItemCount(){
		return item_count;
	}
}
