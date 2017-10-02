package assign2a;

public class ComplexNumberSystemTester {

	public static void main(String[] args) {

		ComplexNumber n1 = new ComplexNumber((float)10.0, (float)7.0);
		ComplexNumber n2 = new ComplexNumber((float)5.0, (float)9.0);

		ComplexNumberSystem cns = new ComplexNumberSystem(n1, n2);
		
		System.out.println("Constructor with two parameters\n");
		cns.add();
	}
}
