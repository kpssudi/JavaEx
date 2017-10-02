package assign2a;

public class ComplexNumberSystemTester {

	public static void main(String[] args) {

		ComplexNumber n1 = new ComplexNumber((float)16.0, (float)14.0);
		ComplexNumber n2 = new ComplexNumber((float)4.0, (float)7.0);

		ComplexNumberSystem cns = new ComplexNumberSystem();
		ComplexNumberSystem cns1 = new ComplexNumberSystem(n1);
		ComplexNumberSystem cns2 = new ComplexNumberSystem(n1, n2);
		ComplexNumberSystem cpcns = new ComplexNumberSystem(cns2);
		
		System.out.println("Using default constructor:\n");
		cns.complexMathOperation();
		System.out.println("\nConstructor with one parameter:\n");
		cns1.complexMathOperation();
		System.out.println("\nConstructor with two parameter:\n");
		cns2.complexMathOperation();
		System.out.println("\nCopy Constructor:\n");
		cpcns.complexMathOperation();
		
	}
}
