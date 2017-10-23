package test;

public class LinearSearch {

	public static void main(String[] args) {
		int searchedValue = 100;
		int pos = 0;
		int[] values = new int[6];
		//values = {22,5,69,100,50,79,1};
		int[] prices = values;
		boolean found = false;
		while (pos < values.length && !found) {
			if(values[pos] == searchedValue) {
				found = true;
				prices[0] = 2;
			}
			else {
				pos++;
			}
		}
		if(found) {System.out.println("Found at position: " + pos);}
		else {System.out.println("Not found");}
	}
}
