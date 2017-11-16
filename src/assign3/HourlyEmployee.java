package assign3;
/**
Classes
EmployeeRecord
Employee
HourlyEmployee
SalariedEmployee
PieceWorkEmployee
Employees
AppDriver
Class Associations
EmployeeRecord (1) ---- includes ---- (1) Employee
HourlyEmployee (1) ---- inherits ----> (1) Employee
SalariedEmployee (1) ---- inherits ----> (1) Employee
PieceWorkEmployee (1) ---- inherits ----> (1) Employee
Employees (1) ---- contains ---- (m) Employee
AppDriver (1) ---- uses ---- (1) Employees
Class Attributes
HourlyEmployee extends Employee
(-) hoursWorked, hourlyPayRate : float
(+) HourlyEmployee()
(+) HourlyEmployee(string lastname,firstname;float hours,payrate)
(+) HourlyEmployee(HourlyEmployee he)
(+) setName(string lastname,firstname)
(+) setHours(float hours)
(+) setRate(float payrate)
(+) getHours()
(+) getRate()
*/
public class HourlyEmployee extends Employee
{
	private float hoursWorked, hourlyPayrate;
	
	public HourlyEmployee()
	{
		this("","",0,0);
	}
	public HourlyEmployee(String lastname, String firstname, float h, float pr)
	{
		
	}
	public HourlyEmployee(HourlyEmployee he)
	{
		
	}
	public void setName(String lastname, String firstname)
	{
		
	}
	public void setHours(float hours)
	{
		
	}
	public void setRate(float payrate)
	{
		
	}
	public float getHours()
	{
		return hours;
	}
	
	public String CompositeName () {
		//e.net = e.gross - (calcTaxes());
		//hourly
		return "H" + ln + fn;
	}
	
}
