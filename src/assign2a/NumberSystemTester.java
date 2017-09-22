package assign2a;

public class NumberSystemTester {

	public static void main(String[] args) {
		//public NumberSystem(Number num1, Number num2)
		Number n1 = new Number(10);
		Number n2 = new Number(5);
		
		NumberSystem numManipulator = new NumberSystem(n1, n2);
		numManipulator.add();
		System.out.println("Addition: " + numManipulator.getResult());
		numManipulator.subtract();
		System.out.printf("Addition: %.2f\n", numManipulator.getResult().get());
		numManipulator.divide();
		System.out.printf("Addition: %.2f\n", numManipulator.getResult().get());
		numManipulator.multiply();
		System.out.printf("Addition: %.2f\n", numManipulator.getResult().get());
		numManipulator.modulo();
		System.out.printf("Addition: %.2f\n", numManipulator.getResult().get());
		//numManipulator.toString();
	}

}
