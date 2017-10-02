package assign2a;
/**
 * java association aggregation composition topic in YouTube
 * Number.java
(-) Number n1, n2, result
(+) NumberSystem()
(+) NumberSystem(Number n1)
(+) NumberSystem(Number n1, Number n2)
(+) NumberSystem(NumberSystem n)
(+) mathOperation()
(+) void add()
(+) void subtract()
(+) void multiply()
(+) void divide()
(+) void modulo()
(+) void invert(Number n)
(+) Number getN1()
(+) Number getN2()
(+) Number getResult()
 */
public class NumberSystem {
	private Number n1;
	private Number n2;
	private Number result;
	
	public NumberSystem(){	
		this(new Number(), new Number());
	}
	public NumberSystem(Number num1Object){
		this(num1Object, new Number());		
	}
	public NumberSystem(Number num1Object, Number num2Object){		
		n1 = num1Object;
		n2 = num2Object;
		result = new Number();
	}
	public NumberSystem(NumberSystem n){
		n1 = n.n1;
		n2 = n.n2;
	}	
	
	public void mathOperation() {
		add();
		subtract();
		multiply();
		divide();
		modulo();
		invert(n1);
	}
	public void add(){
		double sum = n1.get() + n2.get();
		result.set(sum);
		System.out.println("Addition:" + getN1().toString() + " + " + getN2().toString() + " = " + getResult().toString());
		
	}
	public void subtract(){
		result = new Number( n1.get()- n2.get());
		System.out.println("Subtraction:" + getN1().toString() + " - " + getN2().toString() + " = " + getResult().toString());
	}
	public void multiply(){
		result = new Number(n1.get() * n2.get());
		System.out.println("Multiplication:" + getN1().toString() + " * " + getN2().toString() + " = " + getResult().toString());
	}
	public void divide(){
		if (n2.get() != 0) { 
			result = new Number(n1.get() / n2.get());
			System.out.println("Division:" + getN1().toString() + " / " + getN2().toString() + " = " + getResult().toString());
		}
		else {
			result = new Number();
			System.out.println("Division:" + getN1().toString() + " / " + getN2().toString() + " = " + getResult().toString());
		}
	}
	public void modulo(){
		result = new Number(n1.get() % n2.get());
		System.out.println("Modulus:" + getN1().toString() + " % " + getN2().toString() + " = " + getResult().toString());
	}
	public void invert(Number n){
		result = new Number(-1 * n.get());
		System.out.println("Inverse:"  + "-1 * " + getN1().toString() + " = " + getResult().toString() + "\n");
	}
	public Number getN1(){ 
		return n1;
	}
	public Number getN2(){ 
		return n2;
	}
	public Number getResult(){ 
		return result;
	}
}