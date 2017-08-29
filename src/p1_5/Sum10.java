/* Write a program that computes the sum of the first ten positive integers, 1+2+...+10.
 * Hint: Write a program of the form
 */
package p1_5;

public class Sum10 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			//System.out.println(sum);
		}
		System.out.println(sum);	
	}
}
