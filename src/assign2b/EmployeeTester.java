package assign2b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) throws IOException{
		Employees newEmps = new Employees((short)10);
		String output_file = "output.txt";
		String searchName;
		int searchEid;
		float totPayRate, totHrsWkd, totGrossPay, totTaxAmt, totNetPay;
		totPayRate = totHrsWkd = totGrossPay = totTaxAmt = totNetPay = 0;
        try {
        	//String path = System.getProperty("user.dir");
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split("\t");
                String fn = details[0];                
                String ln = details[1];
                float pr = Float.parseFloat(details[2]);
                float hr = Float.parseFloat(details[3]);
                Employee p = new Employee(ln, fn, hr, pr);
                newEmps.add(p);
                //newEmps.add(ln, fn, hr, pr);
            }
            sc.close();
        } catch (FileNotFoundException e) {         
            e.printStackTrace();
        }
        

//Writing payroll (reports) to a file
        Employees.QsortbyEid(newEmps.get(), 0, newEmps.numEmps-1);        
    try {
    		File wf = new File("output.txt");
    		 if (wf.exists()) {
    		     wf.delete(); //you might want to check if delete was successfull
    		     }
	        ReportWriter data = new ReportWriter(output_file, true);
			String formatStr = "%-15s %-25s %-15s %-15s %-15s %-15s %-15s";
			String formatStrNum = "%-15s %-25s %8.2f %15.2f %15.2f %15.2f %15.2f%n";
			data.writeToFile(String.format(formatStr,"Employee", "Employee", "Hours", "Pay", "Gross", "Tax", "Net"));
			data.writeToFile(String.format(formatStr,"ID", "Name", "Worked", "Rate", "Pay", "Amount", "Pay"));
			data.writeToFile(String.format(formatStr,"========", "============", "========", "========", "========", "========", "========"));
	        newEmps.start();
	        EmployeeRecord tmpEmpRec = new EmployeeRecord();
	        while(newEmps.hasNext()) {
	        	tmpEmpRec = newEmps.getNext();
	        	totPayRate += tmpEmpRec.payrate;
	        	totHrsWkd += tmpEmpRec.hours;
	        	totGrossPay += tmpEmpRec.gross;
	        	totTaxAmt += tmpEmpRec.taxamount;
	        	totNetPay += tmpEmpRec.net;
	        	data.writeToFile(tmpEmpRec.toString());
	        }
        //Write summary to the output file
	        data.writeToFile("");
	        data.writeToFile(String.format(formatStr,"", "", "========", "========", "========", "========", "========"));
			data.writeToFile(String.format(formatStrNum,"Totals", "", totPayRate, totHrsWkd, totGrossPay, totTaxAmt, totNetPay));
			data.writeToFile(String.format(formatStrNum,"Average", "", (totPayRate/newEmps.numEmps), (totHrsWkd/newEmps.numEmps), (totGrossPay/newEmps.numEmps), (totTaxAmt/newEmps.numEmps), (totNetPay/newEmps.numEmps)));
    	} 
    catch (IOException e) {
    		System.out.println(e.getMessage());
    }

  //Search employee in the record
    // Search by Lastname
    searchName = "Carl";
    if(newEmps.search(searchName) != null) {
    	System.out.println("Searched by Lastname: " + searchName + "\n");
    	System.out.println(newEmps.search(searchName).toString());        	
    } else {
    	System.out.println("Searched employee '" + searchName + "' not Found!");
    }
    // Search by eID
    searchEid = 102;
    if(newEmps.search(searchEid) != null) {
    	System.out.println("Searched by eID: " + searchEid + "\n");
    	System.out.println(newEmps.search(searchEid).toString());        	
    } else {
    	System.out.println("Searched employee '" + searchEid + "' not Found!");
    }
    
  //Delete employee in the record
    searchName = "Carl";
	System.out.println("Delete record with surname: " + searchName + "\n");
    newEmps.delete(searchName);
    Employees.QsortbyEid(newEmps.get(), 0, newEmps.numEmps-1);
//    Employees.QsortbyLastname(newEmps.get(), 0, newEmps.numEmps-1);
    newEmps.start();
    while(newEmps.hasNext()) {
		EmployeeRecord empList = newEmps.getNext();
		if(empList != null) 
		System.out.println(empList.toString());
    }
/*    searchEid = 104;
	System.out.println("Delete record with eID: " + searchEid + "\n");
    newEmps.delete(searchEid);
    //Employees.QsortbyEid(newEmps.get(), 0, newEmps.numEmps-1);
    newEmps.start();
    while(newEmps.hasNext()) {
		EmployeeRecord empList = newEmps.getNext();
		if(empList != null) 
		System.out.println(empList.toString());
    }*/
    
//Testing all add cases
/*        newEmps.add("Doe", "John", 40f, 15.50f);
		newEmps.add("KP", "Mac", 4f, 15.50f);
		newEmps.add(newEmp1);
		newEmps.add(empRecord);*/

	}
}
