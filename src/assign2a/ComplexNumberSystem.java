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
		
		n1 = new ComplexNumber();
		n2 = new ComplexNumber();
		result = new ComplexNumber();	
	}
	public ComplexNumberSystem(ComplexNumber rp){
		n1 = rp;
		n2 = new ComplexNumber();
	}
	public ComplexNumberSystem(ComplexNumber rp, ComplexNumber ip){
		n1 = rp;
		n2 = ip;
	}
	public ComplexNumberSystem(ComplexNumberSystem cns){
		n1 = cns.n1;
		n2 = cns.n2;
	}

	public void add(){
		result.setReal(n1.getReal() + n2.getReal());		
		result.setImaginary(n1.getImaginary() + n2.getImaginary());
		System.out.println("Addition:" + getN1().toString() + " + " + getN2().toString() + " = " + getResult().toString());
	}
/*	public void subtract(){
		result = new ComplexNumber(n1.get() - n2.get());
	}
	public void multiply(ComplexNumber n1, ComplexNumber n2){
		result = new ComplexNumber(n1.get() * n2.get());
	}
	public void divide(ComplexNumber n1, ComplexNumber n2){
		result = new ComplexNumber(n1.get() / n2.get());
	}*/
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
