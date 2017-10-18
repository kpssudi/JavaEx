package assign2b;
/**
 * Classes
EmployeeRecord
Employee
Employees
AppDriver
Class Associations
EmployeeReoord(1) ---- includes ----(1)Employee
Employees(1) ----contains---- (m)Employee
AppDriver(1) ---- uses - --- (1)Employees
 * EmployeeRecord
(+) LastName, FirstName: string //data
(+) hours,payrate,gross,fedtax,statetax,ssitax,net: float
(+) EmployeeRecord ()
(+) EmployeeRecord(string lastname, firstname; float h, pr, defr)
(+) EmployeeRecord(EmployeeRecord e)
(+) String toString()
Employee
(-) EmployeeRecord e //data
(+) Employee ()
(+) Employee(string lastname,firstname;float h,pr,defr)
(+) Employee(EmployeeRecord e)
(+) calcGross ()
(+) calcTaxes ()
(+) calcNet ()
(+) EmployeeRecord get()
(+)String toString()
Employees
(-) Employees emps //data
(+) Employees(string lastname,firstname;float h,pr,defr)
(+) Employees(EmployeeRecord e)
(+) Employees(Employee e)
(+) add(string lastname,firstname;float h,pr,defr)
(+) add(EmployeeRecord e)
(+) add(Employee e)
(+) delete(string lastname)
(+) delete(int eID)
(+) EmployeeRecord search(int eID)
(+) EmployeeRecord search(string lastname)
(+) sort()
(+) EmployeeRecord iterate(START)
(+) EmployeeRecord iterate(getNEXT)
(+) String toString()
 */

public class EmployeeRecord {
	public String LastName, FirstName;
	public float hours, payrate, gross, fedtax, statetax, ssitax, net, deferred;
	public final float FED_TAXRATE = 0.15f, STATE_TAXRATE = 0.07f, SSI_TAXRATE = 0.0775f; 
	EmployeeRecord(){
		
	}
	EmployeeRecord(String lastname, String firstname, float h, float pr, float defr) {
		this.LastName = lastname;
		this.FirstName = firstname;
		this.hours = h;
		this.payrate = pr;
		this.deferred = defr;
	}
	EmployeeRecord(EmployeeRecord e){
		this.LastName = e.LastName;
		this.FirstName = e.FirstName;
		this.hours = e.hours;
		this.payrate = e.payrate;
		this.deferred = e.deferred;
	}
	
}
