package assign2a;
/**
NumberSystem.java
(-) ComplexNumber n1, n2, result
(+) ComplexNumberSystem()
(+) ComplexNumberSystem(ComplexNumber n1)
(+) ComplexNumberSystem(ComplexNumber n1, ComplexNumber n2)
(+) ComplexNumberSystem(ComplexNumberSystem cns)
(+) void add()
(+) void subtract()
(+) void multiply()
(+) void divide()
(+) ComplexNumber getN1()
(+) ComplexNumber getN2()
(+) ComplexNumber getResult()
 */
public class ComplexNumberSystem {
	private ComplexNumber n1;
	private ComplexNumber n2;
	private ComplexNumber result;
		
	public ComplexNumberSystem(){
		this(new ComplexNumber(), new ComplexNumber());
	}
	public ComplexNumberSystem(ComplexNumber rpObj){
		this(rpObj, new ComplexNumber());
	}
	public ComplexNumberSystem(ComplexNumber rpObj, ComplexNumber ipObj){
		n1 = rpObj;
		n2 = ipObj;
		result = new ComplexNumber();	
	}
	public ComplexNumberSystem(ComplexNumberSystem cns){
		n1 = cns.n1;
		n2 = cns.n2;
		result = cns.result;
	}

/*	public void complexMathOperation() {
		add();
		subtract();
		multiply();
		divide();
	}*/
	public void add(){
		result.setReal(n1.getReal() + n2.getReal());		
		result.setImaginary(n1.getImaginary() + n2.getImaginary());
		System.out.println("Addition:" + getN1().toString() + " + " + getN2().toString() + " = " + getResult().toString());
	}
	public void subtract(){
		result.setReal(n1.getReal() - n2.getReal());		
		result.setImaginary(n1.getImaginary() - n2.getImaginary());
		System.out.println("Subtraction:" + getN1().toString() + " - " + getN2().toString() + " = " + getResult().toString());
	}
	public void multiply(){
		//result.setReal(n1.getReal() * n2.getReal());		
		//result.setImaginary(n1.getImaginary() * n2.getImaginary());
		result.setReal((n1.getReal() * n2.getReal()) - (n1.getImaginary() * 
				n2.getImaginary()));
		result.setImaginary((n1.getReal() * n2.getImaginary()) - (n1.getImaginary() * 
				n2.getReal()));
		System.out.println("Multiplication:" + getN1().toString() + " * " + 
				getN2().toString() + " = " + getResult().toString());
	}
	public void divide(){
		if (n2.getReal() != 0) { 
			result.setReal((n1.getReal() + n1.getImaginary()) * (n2.getReal() -
					n2.getImaginary()) / (n2.getReal() * n2.getReal()));
			result.setImaginary((n1.getReal() + n1.getImaginary()) * (n2.getReal() -
					n2.getImaginary()) / (n2.getImaginary() * n2.getImaginary()));

			System.out.println("Division:" + getN1().toString() + " / " + 
					getN2().toString() + " = " + getResult());
		}
		else {
			System.out.println("Division:" + getN1().toString() + " / " + 
					getN2().toString() + " = " + getResult());
		}
		
	}
	
	public ComplexNumber getN1(){ 
		return n1;
	}
	public ComplexNumber getN2(){ 
		return n2;
	}
	public ComplexNumber getResult(){ 
		return result;
	}
}
