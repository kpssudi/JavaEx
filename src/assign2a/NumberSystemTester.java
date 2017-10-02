package assign2a;

public class NumberSystemTester {

	public static void main(String[] args) {		
		Number n1 = new Number(-10);
		Number n2 = new Number(5);

		NumberSystem ns = new NumberSystem();
		NumberSystem ns1 = new NumberSystem(n1);
		NumberSystem ns2 = new NumberSystem(n1, n2);
		NumberSystem copyns = new NumberSystem(ns2);
		
		System.out.println("Using default constructor:\n");
		ns.mathOperation();
		System.out.println("Constructor with one parameter:\n");
		ns1.mathOperation();
		System.out.println("Constructor with two parameter:\n");
		ns2.mathOperation();
		System.out.println("Copy Constructor:\n");
		copyns.mathOperation();
	}
}
