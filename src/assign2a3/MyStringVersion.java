package assign2a3;
/**
(-) byte[] private String;
(+) MyStringClass()
(+) MyStringClass(string s)
(+) MyStringClass(myStringClass msc)
(+) MyStringClass left (short size)
(+) MyStringClass right(short size )
(+) MyStringClass mid (short startlndex, short size)
(+) short instr(short startindex, MyStringClass searchString)
(+) MyStringClass upper()
(+) MyStringClass lower ()
(+) MyStringClass invert()
(+) string toStrinq()
	AppDriver --- 1 : 1(uses) --- MyStringClass
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
    	this("");
    }
    public MyStringVersion(String inputJavaString){
    	bytesArray = new byte[inputJavaString.length()];
    	
 /*   	for(int i=0; i<inputJavaString.length(); i++){
    		bytesArray[i] = inputJavaString.charAt(i);
    	}*/
    	bytesArray = inputJavaString.getBytes();
    }
    public MyStringVersion(MyStringVersion S){
    	bytesArray = S.bytesArray;
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
        
/*    public MyStringVersion instr(String searchstring, int startPos, int size){
    	
    	//return new MyStringVersion(new String(bytesArray, searchstring, startPos-1));   
    }*/
    
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
    public String toString(){
    	return new String(this.bytesArray, 0, this.bytesArray.length);    	
    }
    public MyStringVersion upperCase(){
    	int ascii = 0;
    	for(int i=0; i<bytesArray.length; i++){
    		ascii = bytesArray[i];
    		if ((ascii >= 97) && (ascii <=122)) {
    			bytesArray[i] -= 32;
    		}
    	}
    	return new MyStringVersion(new String(bytesArray));
    }
 
    public MyStringVersion lowerCase(){
    	int ascii = 0;
    	for(int i=0; i<bytesArray.length; i++){
       		ascii = bytesArray[i];
    		if ((ascii >= 65) && (ascii <=90)) {
    			bytesArray[i] += 32;
    		}
    	}
    	return new MyStringVersion(new String(bytesArray));
    }
    
        
    public int length(){
    	return this.bytesArray.length;
    }
      
        
/*    public static void main(String []args){
       MyStringVersion myString = new MyStringVersion("Hello world!");
       System.out.println(myString.lowerCase());
    }*/
}