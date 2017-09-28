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
	private char imaginaryPart;
	private ComplexNumber _num;
	public ComplexNumber(){
		realPart = 0;
		imaginaryPart = 'i';
	}
	public ComplexNumber(float rp, char ip){
		realPart = rp;
		imaginaryPart = ip;
	}
	public ComplexNumber(ComplexNumber aNumber){
		this._num = aNumber;
	}
	public float getReal(){
		return realPart;
	}
	public float getImaginary(){
		return imaginaryPart;
	}
	public void set(float rp){
		realPart = rp;
	}
	public void set(char ip){
		imaginaryPart = ip;
	}

	public String toString(){
		return "Real number is: " + realPart + 
				"\nImaginary number is: " + imaginaryPart;
				
	}
}
