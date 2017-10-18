package ch_6;
import java.util.Scanner;
public class R6_8_doLoop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int value, counter = 0;
		do
		{
			System.out.print("Enter an integer <= 10: ");
			value = in.nextInt();
			if(value >=1 && value <= 10) {
				break;
			}
			else {
				counter++;
				continue;
			}
		}
		while (counter < 3);
	}

}
