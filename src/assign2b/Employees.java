package assign2b;
//import java.util.Arrays;;
/**
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
	private int numID = 100;
	private int cursor;
	
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
		emps[numEmps].get().eID = numID++;
		emps[numEmps] = tempEmp;
		emps[numEmps].calcGross();
		emps[numEmps].calcTaxes();
		emps[numEmps].calcNet();
		numEmps++;
	}
	public void add(EmployeeRecord empRec) {
		Employee tmpEmp1 = new Employee(empRec);
		emps[numEmps].get().eID = numID++;
		emps[numEmps] = tmpEmp1;
		emps[numEmps].calcGross();
		emps[numEmps].calcTaxes();
		emps[numEmps].calcNet();
		numEmps++;
	}
	public void add(Employee emp) {
		emps[numEmps] = emp;
		emps[numEmps].get().eID = numID++;
		emps[numEmps].calcGross();
		emps[numEmps].calcTaxes();
		emps[numEmps].calcNet();
		numEmps++;
	}
	public void start() {
		cursor = 0;
	}
	public boolean hasNext() {
		if (cursor < numEmps) { //emps.length
			return true;			
		}
		return false;
	}
	public EmployeeRecord getNext() {
		return emps[cursor++].get();			
	}
	public EmployeeRecord search(String surname) {
		start();
		while(hasNext()) {
			EmployeeRecord empList = getNext();
			if(empList.LastName.equals(surname) ) {
				return empList;
			}
		}
		return null;
	}
	public EmployeeRecord search(int empId) {
		start();
		while(hasNext()) {
			EmployeeRecord empList = getNext();
			if(empList.eID == empId) {
				return empList;
			}
		}
		return null;
	}
	
/*	public void delete(String surname) {
		EmployeeRecord toDelete = new EmployeeRecord();
		EmployeeRecord tmp = new EmployeeRecord();
		toDelete = search(surname);
		if(toDelete != null) {
			
		}
	}*/
/*	public static int compareThem(emps a, emps b)
	public void sort() {
		Arrays.sort;
	}*/

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
