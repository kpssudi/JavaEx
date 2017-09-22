package assign2a;
/**
 * Number
(-) value
(+) Number() // default constructor
(+) Number (v) // parameterized constructor
(+) Number (Number) // copy constructor
(+) datatype get() // accessor;note,datatype is an appropriate type
(+) void set (v) // manipulator
(+) strinq toString() // provides external form of Number
 */
public class Number {

	private double value;
	private Number _num;
	public Number(){
		value = 0;
	}
	public Number(double num){
		value = num;
	}
	public Number(Number aNumber){
		this._num = aNumber;
	}
	public double get(){
		return value;
	}
	public void set(double v){
		value = v;
	}
	public String toString(){
		return "First number is: " + value + 
				"\nSecond number is: " + value +
				"\nResult is: " + value;
	}
}
