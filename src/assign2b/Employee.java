package assign2b;
/**
 * Employee
(-) EmployeeRecord e //data
(+) Employee ( )
(+) Employee(string lastname,firstname;float h,pr,defr)
(+) Employee(EmployeeRecord e)
(+) calcGross ()
(+) calcTaxes ()
(+) calcNet ()
(+) EmployeeRecord get()
(+) String toString()
 *
 */
public class Employee {
	private EmployeeRecord e;
	public Employee(){
		this("","",0,0,0);
	}
	public Employee(String lastname, String firstname, float h, float pr, float defr){		
		e.LastName = lastname;
		e.FirstName = firstname;
		e.hours = h;
		e.payrate = pr;
		e.deferred = defr;
	}
	public Employee(EmployeeRecord emp) {
		e.LastName = emp.LastName;
		e.FirstName = emp.FirstName;
		e.hours = emp.hours;
		e.payrate = emp.payrate;
		e.deferred = emp.deferred;
	}
	
	public float calcGross (){
		e.gross = e.hours * e.payrate;
		return e.gross;
	}
	public float calcTaxes (){
		e.fedtax = e.gross *  
	}
	public float calcNet () {
		
	}
	public EmployeeRecord get() {
		
	}
	public String toString(){
		
	}
}
