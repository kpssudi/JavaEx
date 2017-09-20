package assign2a;

public class NumberSystemTester {

	public static void main(String[] args) {
		NumberSystem numManipulator = new NumberSystem(10, 5);
		numManipulator.add();
		System.out.printf("Addition: %.2f\n", numManipulator.getResult());
		numManipulator.subtract();
		numManipulator.divide();
		numManipulator.multiply();
		numManipulator.modulo();

	}

}
