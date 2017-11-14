package assign3;
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
	public int numEmps = 0;
	private int numID = 105;
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
		emps[numEmps].get().eID = numID--;
		emps[numEmps].calcGross();
		emps[numEmps].calcTaxes();
		emps[numEmps].calcNet();
		numEmps++;
	}
	public void start() {
		cursor = 0;
	}
	public boolean hasNext() {
		if (cursor < numEmps) {
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
	
	public void delete(String surname) {
		Employee tmpEmpLast = emps[numEmps-1];
		start();
		while(hasNext()) {
			EmployeeRecord empList = getNext();
			if(empList.LastName.equals(surname) ) {				
				cursor = cursor-1;
				emps[cursor] = tmpEmpLast;
				emps[numEmps-1] = null;
				numEmps--;
				return;
			}
		}		
	}
	public void delete(int empID) {
		start();
		while(hasNext()) {
			EmployeeRecord empList = getNext();
			if(empList.eID == empID) {
				cursor = cursor-1;
				emps[cursor] = null;
				return;
			}
		}		
	}

	public static void QsortbyLastname(Employee[] table,int start,int finish)
	{
	int left=start,right=finish;
	Employee pivot = table[(start+finish)/2];
	while (left < right)
	{
		String s1 = table[left].get().LastName;
		String s2 = pivot.get().LastName;
		int s1int, s2int;
		s1int = Integer.parseInt(s1);
		s2int = Integer.parseInt(s2);
		while (s1int < s2int) left++;
		while (s1int > s2int) right--;		
//		while (table[left].get().LastName == pivot.get().LastName) left++;
//		while (table[right].get().LastName == pivot.get().LastName) right--;
		if (left <= right) {
		Employee temp = table[left];
		table[left]= table[right];
		table[right] = temp;
		left++;
		right--;
	}
	}
		if (start < right) QsortbyLastname(table,start,right);
		if (left < finish) QsortbyLastname(table,left,finish);
	}
	public static void QsortbyEid(Employee[] table,int start,int finish)
	{
	int left=start,right=finish;
	Employee pivot = table[(start+finish)/2];
	while (left < right)
	{
		while (table[left].get().eID < pivot.get().eID) left++;
		while (table[right].get().eID > pivot.get().eID) right--;
		if (left <= right) {
		Employee temp = table[left];
		table[left]= table[right];
		table[right] = temp;
		left++;
		right--;
	}
	}
		if (start < right) QsortbyEid(table,start,right);
		if (left < finish) QsortbyEid(table,left,finish);
	}
	public Employee[] get() {
		return emps;
	}
	public String toString(){
		Employee empStr = new Employee();
		String fullName = empStr.get().LastName + ", " + empStr.get().FirstName;
		String formatStr = "%-15s %-25s %8.2f %15.2f %15.2f %15.2f %15.2f%n";
		return String.format(formatStr, empStr.get().eID, fullName, empStr.get().hours, empStr.get().payrate, empStr.get().gross, empStr.get().taxamount, empStr.get().net);
	}
}
