package assign2a;
/**
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
	private double n1;
	private double n2;
	private double result;
	
	public NumberSystem(){
		n1 = 0;
		n2 = 0;
		result = 0;
	}
	public NumberSystem(Number num1){
		n1 = num1.get();
	}
	public NumberSystem(Number num1, Number num2){
		n1 = num1.get();
		n2 = num2.get();
	}
	public NumberSystem(NumberSystem n){
		
	}

	public void add(){
		result = n1 + n2;
	}
	public void subtract(){
		result = n1 - n2;
	}
	public void multiply(){
		result = n1 * n2;
	}
	public void divide(){
		result = n1 / n2;
	}
	public void modulo(){
		result = n1 % n2;
	}
	public void invert(Number n){
		//result = 1/n;
	}
	public double getNl(){ //should be 'double' or 'Number'
		return n1;
	}
	public double getN2(){ //should be 'double' or 'Number'
		return n2;
	}
	public double getResult(){ //should be 'double' or 'Number'
		return result;
	}
}
