package assign2a;
/**
 * Pseudo Code of Driver class ComplexNumberSystemTester
 * Create first instance of ComplexNumber with two parameters
 * Create second instance of ComplexNumber with two parameters
 * Create instance of ComplexNumberSystem's constructor(s) (default, one parameter two parameter AND copy)
 * Print heading as 'Copy Constructor' and call add() method of copy constructor
 * Print heading as 'Using default constructor' and call subtract() method of default constructor
 * Print heading as 'Constructor with one parameter' and call multiply() method of one parameterized constructor
 * Print heading as 'Constructor with two parameter' and call divide() method of two parameterized constructor
 */
public class ComplexNumberSystemTester {

	public static void main(String[] args) {

		ComplexNumber n1 = new ComplexNumber((float)16.0, (float)14.0);
		ComplexNumber n2 = new ComplexNumber((float)4.0, (float)7.0);

		ComplexNumberSystem cns = new ComplexNumberSystem();
		ComplexNumberSystem cns1 = new ComplexNumberSystem(n1);
		ComplexNumberSystem cns2 = new ComplexNumberSystem(n1, n2);
		ComplexNumberSystem cpcns = new ComplexNumberSystem(cns2);

		System.out.println("\nCopy Constructor:\n");
		cpcns.add();		
		System.out.println("\nUsing default constructor:\n");
		cns.subtract();
		System.out.println("\nConstructor with one parameter:\n");
		cns1.multiply();
		System.out.println("\nConstructor with two parameter:\n");
		cns2.divide();
		
	}
}
