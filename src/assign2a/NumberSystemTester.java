package assign2a;
/**
 * Pseudo Code of Driver class NumberSystemTester
 * Create first instance of Number with one parameters
 * Create second instance of Number with one parameters
 * Create instance of NumberSystem's constructor(s) (default, one parameter two parameter AND copy)
 * Print heading as 'Using default constructor' and call add() method of default constructor
 * Print heading as 'Constructor with one parameter' and call subtract() method of one parameterized constructor
 * Print heading as 'Constructor with two parameter' and call multiply() method of two parameterized constructor
 * Print heading as 'Copy Constructor' and call divide(), modulo() and invert() methods of copy constructor
 */
public class NumberSystemTester {

	public static void main(String[] args) {		
		Number n1 = new Number(-10);
		Number n2 = new Number(5);

		NumberSystem ns = new NumberSystem();
		NumberSystem ns1 = new NumberSystem(n1);
		NumberSystem ns2 = new NumberSystem(n1, n2);
		NumberSystem cpns = new NumberSystem(ns2);
		
		System.out.println("\nDfault constructor:\n");
		ns.add();
		System.out.println("\nConstructor with one parameter:\n");
		ns1.subtract();
		System.out.println("\nConstructor with two parameter:\n");
		ns2.multiply();
		System.out.println("\nCopy Constructor:\n");
		cpns.divide();
		cpns.modulo();
		cpns.invert(n1);
	}
}
