package assign2b;
import java.util.Collections;

/**
 *
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
public class Employees {
	private Employee[] emps;
	private int numEmps = 0;
	
	public Employees() {
		emps = new Employee[100];
	}
	public Employees(short size) {
		emps = new Employee[size];
	}
	public Employees(Employees es) {
		emps = es.emps;
		
	}
	public void add(String lastname, String firstname, float h, float pr) {
		Employee tempEmp = new Employee(lastname, firstname, h, pr);
		emps[numEmps].calcGross();
		emps[numEmps].calcTaxes();
		emps[numEmps].calcNet();
		emps[numEmps] = tempEmp;
		numEmps++;
	}
	public void add(EmployeeRecord empRec) {
		Employee tmpEmp1 = new Employee(empRec);
		emps[numEmps] = tmpEmp1;
		numEmps++;
	}
	public void add(Employee emp) {
		emps[numEmps] = emp;
		numEmps++;
	}
	public void sort() {
//		Collections.sort();
	}
//	public EmployeeRecord iterate(START) {
		
//	}
	public String toString(){
		Employee empStr = new Employee();
		return new String(empStr.get().LastName + ", " + 
							empStr.get().FirstName + "\t" + empStr.get().hours + "\t" +  
							empStr.get().payrate + "\t" + empStr.get().gross + "\t" + 
							empStr.get().taxamount + "\t" + empStr.get().net );
	}
	
/*	public void add (String ln, float h) {
		employee newone = new employee(ln, h);
		emps.[getNextFreeIndex()] = newONe;
	}*/
}
