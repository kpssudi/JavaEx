/* Put calculation for Overtime*/
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
		if (e.hours < 40) {
			e.gross = e.hours * e.payrate;
		} else {
			e.gross = 40 * e.payrate;
			e.gross += (e.hours - 40) * (1.5 * e.payrate); 
		}		
		return Math.round((e.gross * 100.0)/100.0);
	}
	public float calcTaxes (){		
		e.fedtax = e.gross * e.FED_TAXRATE;
		e.statetax = e.gross * e.STATE_TAXRATE;
		e.ssitax = e.gross * e.SSI_TAXRATE;
		e.taxamount = e.fedtax + e.statetax + e.ssitax;
		return Math.round((e.taxamount * 100.0)/100.0);
	}
	public float calcNet () {
		e.net = e.gross - (calcTaxes());
		return Math.round((e.net * 100.0)/100.0); //e.fedtax + e.statetax + e.ssitax
	}
	public EmployeeRecord get() {
		return e;
	}
	public void set(EmployeeRecord empRec){
		e = empRec;
	}
	public String toString(){
		String fullName = e.LastName + ", " + e.FirstName;
		String formatStr = "%-15s %-25s %8.2f %15.2f %15.2f %15.2f %15.2f%n";
		return String.format(formatStr, e.eID, fullName, e.hours, e.payrate, e.gross, e.taxamount, e.net);
	}
}
