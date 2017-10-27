package assign2b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//http://www.homeandlearn.co.uk/java/write_to_textfile.html
//https://codereview.stackexchange.com/questions/15062/reading-a-line-from-a-text-file-and-splitting-its-contents
import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) throws IOException{
		Employees newEmps = new Employees((short)10);
		String output_file = "output.txt";
		String searchName;
		int searchEid;
	//	EmployeeRecord empRecord = new EmployeeRecord("SP", "Pheng", 14f, 15.50f);
	//	Employee newEmp1 = new Employee("DP", "Dee", 13f, 15.50f);
        try {
        	//String path = System.getProperty("user.dir");
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);

            //List<Employees> people = new ArrayList<Employees>();

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split("\t");
                String ln = details[0];
                String fn = details[1];                
                float hr = Float.parseFloat(details[2]);
                float pr = Float.parseFloat(details[3]);
                Employee p = new Employee(ln, fn, hr, pr);
                newEmps.add(p);
                //newEmps.add(ln, fn, hr, pr);
            }

/*            for(int i=0; i < newEmps.){
                System.out.println(p.toString());
            }*/
            sc.close();
        } catch (FileNotFoundException e) {         
            e.printStackTrace();
        }
//Search employee in the record
        searchName = "Whittle";
        if(newEmps.search(searchName) != null) {
        	System.out.println(newEmps.getNext().toString());        	
        } else {
        	System.out.println("Searched employee '" + searchName + "' not Found!");
        }
//Writing payroll (reports) to a file
//        newEmps.sort();
        
    try {
        ReportWriter data = new ReportWriter(output_file, true);
        //data.writeToFile("\nThis is additional line");
        data.writeToFile("Employee" + "\t" + "Pay" + "\t" +  
							"Hours" + "\t" + "Gross" + "\t" + 
							"Tax" + "\t" + "Net\n");
        data.writeToFile("Name" + "\t" + "Rate" + "\t" +  
							"Worked" + "\t" + "Pay" + "\t" + 
							"Amount" + "\t" + "Pay\n");
        data.writeToFile("========" + "\t" + "======" + "\t" +  
							"======" + "\t" + "======" + "\t" + 
							"======" + "\t" + "======\n");
        newEmps.start();
        while(newEmps.hasNext()) {
        	data.writeToFile(newEmps.getNext().toString());
        }
        
    } catch (IOException e) {
    	System.out.println(e.getMessage());
    }
    
//Testing all add cases
/*        newEmps.add("Doe", "John", 40f, 15.50f);
		newEmps.add("KP", "Mac", 4f, 15.50f);
		newEmps.add(newEmp1);
		newEmps.add(empRecord);*/

	}
}
