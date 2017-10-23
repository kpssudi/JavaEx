package assign2b;


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
	
	public Employees() {
		emps = new Employee[100];
	}
	public Employees(short size) {
		emps = new Employee[size];
	}
	public Employees(Employees es) {
		//emps = es;
		
	}
	public void add(String lastname, String firstname, float h, float pr, float defr) {
		Employee tempEmp = new Employee(lastname, firstname, h, pr, defr);
		emps[0] = tempEmp;
	}
	
/*	public void add (String ln, float h) {
		employee newone = new employee(ln, h);
		emps.[getNextFreeIndex()] = newONe;
	}*/
}
