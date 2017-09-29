package assign2a;

public class NumberSystemTester {

	public static void main(String[] args) {		
		Number n1 = new Number(-10);
		Number n2 = new Number(5);
		
		NumberSystem ns = new NumberSystem(n1, n2);
		NumberSystem ns1 = new NumberSystem(n1);
		NumberSystem cns = new NumberSystem(ns);
		cns.add();
//		System.out.println("Addition:" + cns.getN1().toString() + " + " + cns.getN2().toString() + " = " + cns.getResult().toString());

		ns1.add();
//		System.out.println("Addition:" + ns1.getN1().toString() + " + " + ns1.getN2().toString() + " = " + ns1.getResult().toString());

		System.out.println("Mathematical operations using two numbers");
		ns.add();
//		System.out.println("Addition:" + ns.getN1().toString() + " + " + ns.getN2().toString() + " = " + ns.getResult().toString());
		ns.subtract();
		System.out.println("\nSubtraction:"  + ns.getN1().toString() + " - " + ns.getN2().toString() + " = " + ns.getResult().toString());
		ns.multiply();
		System.out.println("\nMultiplication:"  + ns.getN1().toString() + " * " + ns.getN2().toString() + " = " + ns.getResult().toString());
		ns.divide();
		System.out.println("\nDivision:"  + ns.getN1().toString() + " / " + ns.getN2().toString() + " = " + ns.getResult().toString());
		ns.modulo();
		System.out.println("\nModulus:"  + ns.getN1().toString() + " % " + ns.getN2().toString() + " = " + ns.getResult().toString());
		ns.invert(n1);
		System.out.println("\nInverse:"  + "-1 * " + ns.getN1().toString() + " = " + ns.getResult().toString());		
	}
}
