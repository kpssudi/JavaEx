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
		this("","",0,0);
	}
	public Employee(String lastname, String firstname, float h, float pr){
		e = new EmployeeRecord();
		e.LastName = lastname;
		e.FirstName = firstname;
		e.hours = h;
		e.payrate = pr;
	}
	public Employee(EmployeeRecord emp) {
		e = new EmployeeRecord();
		e.LastName = emp.LastName;
		e.FirstName = emp.FirstName;
		e.hours = emp.hours;
		e.payrate = emp.payrate;
	}
	
	public float calcGross (){
		e.gross = e.hours * e.payrate;
		return e.gross;
	}
	public float calcTaxes (){		
		e.fedtax = e.gross * e.FED_TAXRATE;
		e.statetax = e.gross * e.STATE_TAXRATE;
		e.ssitax = e.gross * e.SSI_TAXRATE;
		e.taxamount = e.fedtax + e.statetax + e.ssitax;
		return e.taxamount;
	}
	public float calcNet () {
		e.net = e.gross - (calcTaxes());
		return e.net; //e.fedtax + e.statetax + e.ssitax
	}
	public EmployeeRecord get() {
		return e;
	}
	public void set(EmployeeRecord empRec){
		e = empRec;
	}
/*	public void set(float gr) {
		e.gross = gr;
	}
	public void set(float ta) {
		e.taxamount = ta;
	}
	public void set(float na) {
		e.net = na;
	}*/

/*	public String toString(){
		
	}*/
}
