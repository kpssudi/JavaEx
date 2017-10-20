package assign2a3;
/**
(-) byte[] private String;
(+) MyStringVersion()
(+) MyStringVersion(string s)
(+) MyStringVersion(MyStringVersion msv)
(+) MyStringVersion left(int size)
(+) MyStringVersion right(int size )
(+) MyStringVersion mid(int startPos, int size)
(+) MyStringVersion substring(int startPos, int endPos)
(+) MyStringVersion charAtPos(int pos)
(+) short instr(MyStringVersion searchString, short startindex)
(+) MyStringVersion upperCase()
(+) MyStringVersion lowerCase()
(+) MyStringVersion invert()
(+) short length()
(+) string toStrinq()
	AppDriver --- 1 : 1(uses) --- MyStringVersion
 */
/*
 * public String(byte[] bytes, String newstring)
 * public String(byte[] bytes, int start, int count)
 * public String(byte[] bytes, int start, int count, String newstring)
 * 
 * public String(char[] chars)
 * public String(char[] chars, int start, int count)
 * 
 * public String(StringBuffer buffer)
 */
public class MyStringVersion{
    private byte[] bytesArray;
    
    public MyStringVersion(){
    	this("SuperComputer");
    }
    public MyStringVersion(String inputJavaString){
    	bytesArray = new byte[inputJavaString.length()];
    	
 /*   	for(int i=0; i<inputJavaString.length(); i++){
    		bytesArray[i] = inputJavaString.charAt(i);
    	}*/
    	bytesArray = inputJavaString.getBytes();
    }
    public MyStringVersion(MyStringVersion msv){
    	bytesArray = msv.bytesArray;
    }

    public MyStringVersion left(int size){
    	return new MyStringVersion(new String(bytesArray, 0, size));
    }
    
    public MyStringVersion left(){
    	return this.left(1);
    }
    
    public MyStringVersion right(int size){
    	return new MyStringVersion(new String(bytesArray, bytesArray.length-size, size));   
    }
    
    public MyStringVersion right(){
    	return this.right(1);
    }
    
    public MyStringVersion mid(int startPos, int size){
    	return new MyStringVersion(new String(bytesArray, startPos-1, size));   
    }
    
    public MyStringVersion mid(){
    	return this.mid(1, bytesArray.length);    	    	
    }
    
    public MyStringVersion subString(int startPos, int endPos){
    	return new MyStringVersion(new String(bytesArray, startPos-1, endPos));   
    }
    public MyStringVersion charAtPos(int pos){
    	return new MyStringVersion(new String(bytesArray, pos-1, 1));   
    }
        
    public int instr(String searchstring, int startPos){
    	byte[] searchText = searchstring.getBytes();
    	boolean status = false;
    	int st=0, foundPos = 0;
    	   	for(int i = startPos - 1; i < bytesArray.length; i++){
    	   		if(st < searchText.length) {
                   	if(searchText[st] == bytesArray[i]) {
                   		status = true;
                   		st++;
                   		foundPos = i;
                   	}
                   	else {status = false; st = 0;}  // st=0 sets the search string's initial position to search upto the end of string  			    		    	   			
    	   		}
    	   		else{break;}
    	   	}
    	   	
    	if(status){
        	return (foundPos-st) + 2;       		
    	}
    	else {
        	return -1;
    	}
    }
    public String toString(){
    	return new String(this.bytesArray, 0, this.bytesArray.length);    	
    }
    
    public MyStringVersion invert(){
    	byte[] tempbytesArray;
    	int strLen = bytesArray.length;
    	int counter = 0;
    	tempbytesArray = new byte[bytesArray.length];
    	for(int i=strLen-1; i>=0; i--){
    		tempbytesArray[counter] = bytesArray[i];
    		counter++;
    	}
    	return new MyStringVersion(new String(tempbytesArray));
    }
    public MyStringVersion upperCase(){
    	int ascii = 0;
    	byte[] tempArray;
    	tempArray = new byte[bytesArray.length];
    	for(int i=0; i<bytesArray.length; i++){
    		ascii = bytesArray[i];
    		tempArray[i] = bytesArray[i];
    		if ((ascii >= 97) && (ascii <=122)) {
    			tempArray[i] -= 32;
    		}
    	}
    	return new MyStringVersion(new String(tempArray));
    }
 
    public MyStringVersion lowerCase(){
    	int ascii = 0;
    	byte[] tempArray;
    	tempArray = new byte[bytesArray.length];
    	for(int i=0; i<bytesArray.length; i++){
       		ascii = bytesArray[i];
    		tempArray[i] = bytesArray[i];
    		if ((ascii >= 65) && (ascii <=90)) {
    			tempArray[i] += 32;
    		}
    	}
    	return new MyStringVersion(new String(tempArray));
    }
        
    public int length(){
    	return this.bytesArray.length;
    }
      
        
/*    public static void main(String []args){
       MyStringVersion myString = new MyStringVersion("Hello world!");
       System.out.println(myString.lowerCase());
    }*/
}