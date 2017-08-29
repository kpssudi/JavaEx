/* Write a program that computes the sum of the reciprocals 1/1 + 1/2 + ...+1/10.
 * This is harder than it sounds. Try writing the program, and check the result.
 * The program's result isn't likely to be correct. Then write the denominators as
 * floating-point numbers, 1.0, 2.0, ..., 10.0, and run the program again.
 * Can you explain the difference in the results? We will explore this phenomenon in Chapter 4.  
 */
package p1_6;

public class SumOfReciprocals {

	public static void main(String[] args) {
		int sum = 0;
		double sum1 = 0;
		sum = 1/1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 + 1/9 + 1/10;
		System.out.println("sum of reciprocals: " + sum);
		sum1 = 1/1.0 + 1/2.0 + 1/3.0 + 1/4.0 + 1/5.0 + 1/6.0 + 1/7.0 + 1/8.0 + 1/9.0 + 1/10.0;
		System.out.println("sum of reciprocals with denominators as floating-point numbers: " + sum1);
	}
}
