package assign2a;
/**
ComplexNumber.java
(-) realPart, imaginaryPart
(+) ComplexNumber() // default constructor
(+) ComplexNumber (rPart, iPart) // parameterized constructor
(+) ComplexNumber (ComplexNumber) // copy constructor
(+) float getReal() // accessor;
(+) float getImaginary() // accessor;
(+) void setReal (rp) // manipulator
(+) void setImaginary (ip) // manipulator
(+) strinq toString() // provides external form of ComplexNumber
 */
public class ComplexNumber {

	private float realPart;
	private float imaginaryPart;
	
	public ComplexNumber(){
		realPart = 0;
		imaginaryPart = 0;
	}
	public ComplexNumber(float rp, float ip){
		realPart = rp;
		imaginaryPart = ip;
	}
	public ComplexNumber(ComplexNumber aNumber){
		realPart = aNumber.realPart;
		imaginaryPart = aNumber.imaginaryPart;
	}
	public float getReal(){
		return realPart;
	}
	public float getImaginary(){
		return imaginaryPart;
	}
	public void setReal(float rp){
		realPart = rp;
	}
	public void setImaginary(float ip){
		imaginaryPart = ip;
	}

	public String toString(){
		//return "" + getReal() + getImaginary();
		return new String("(" + realPart + "+" + imaginaryPart + "i" + ")");
	}
}