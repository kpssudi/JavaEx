package assign2a;
/**
 * java association aggregation composition topic in YouTube
 * Number.java
(-) Number n1, n2, result
(+) NumberSystem()
(+) NumberSystem(Number n1)
(+) NumberSystem(Number n1, Number n2)
(+) NumberSystem(NumberSystem n)
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
	private NumberSystem _n;
	
	
	public NumberSystem(){
		
		n1 = new Number();
		//n1 = new Number(10);
		//n1 = new Number(new Number(new Number()));
		n2 = new Number();
		result = new Number();
	}
	public NumberSystem(Number num1){
		n1 = num1;
	}
	public NumberSystem(Number num1, Number num2){
		n1 = num1;
		n2 = num2;
	}
	public NumberSystem(NumberSystem n){
		_n = n;
	}

	public void add(){
		result = new Number(n1.get() + n2.get());
		
	}
	public void subtract(){
		result = new Number(n1.get() - n2.get());
	}
	public void multiply(){
		result = new Number(n1.get() * n2.get());
	}
	public void divide(){
		result = new Number(n1.get() / n2.get());
	}
	public void modulo(){
		result = new Number(n1.get() % n2.get());
	}
	public void invert(Number n){
		result = new Number(-1 * n.get());
	}
	public Number getNl(){ 
		return n1;
	}
	public Number getN2(){ 
		return n2;
	}
	public Number getResult(){ 
		return result;
	}
	public String toString(){
		return "First number is: " + n1 +
				"\nSecond number is: " + n2 + 
				"\nResult is: " + getResult();
	}
}
