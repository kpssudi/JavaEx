package assign2a;

public class NumberSystemTester {

	public static void main(String[] args) {		
		Number n1 = new Number(10);
		Number n2 = new Number(5);
		
		NumberSystem numManipulator = new NumberSystem(n1, n2);

		System.out.println("Mathematical operations using two numbers");
		numManipulator.add();
		System.out.println("Addition:\n" + numManipulator.toString());
		numManipulator.subtract();
		System.out.println("\nSubtraction:\n" + numManipulator.toString());
		numManipulator.multiply();
		System.out.println("\nMultiplication:\n" + numManipulator.toString());
		numManipulator.divide();
		System.out.println("\nDivision:\n" + numManipulator.toString());
		numManipulator.modulo();
		System.out.println("\nModulus:\n" + numManipulator.toString());
		numManipulator.invert(n1);
		System.out.println("\nInverse:\n" + numManipulator.toString());

		
	}

}
