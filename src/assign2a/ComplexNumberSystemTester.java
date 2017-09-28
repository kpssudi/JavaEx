package assign2a;

public class ComplexNumberSystemTester {

	public static void main(String[] args) {

		ComplexNumber n1 = new ComplexNumber((float)10.0, 'i');
		ComplexNumber n2 = new ComplexNumber((float)5.0, 'i');

		ComplexNumberSystem numManipulator = new ComplexNumberSystem(n1, n2);
		
		System.out.println("Mathematical operations using two Complex numbers");
		numManipulator.add();
		System.out.println("Addition: " + numManipulator.toString());
		numManipulator.subtract();
		System.out.printf("Subtraction: %.2f\n", numManipulator.toString());
		numManipulator.multiply();
		System.out.printf("Multiplication: %.2f\n", numManipulator.toString());
		numManipulator.divide();
		System.out.printf("Division: %.2f\n", numManipulator.toString());
	}

}
