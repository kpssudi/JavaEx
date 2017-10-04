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
public class MyStringVersion{
    private char[] charArray;
    
    public MyStringVersion(){
    	this("");
    }
    public MyStringVersion(String inputJavaString){
    	charArray = new char[inputJavaString.length()];
    	
 /*   	for(int i=0; i<inputJavaString.length(); i++){
    		charArray[i] = inputJavaString.charAt(i);
    	}*/
    	charArray = inputJavaString.toCharArray();
    }
    public MyStringVersion(MyStringVersion S){
    	charArray = S.charArray;
    }

    public MyStringVersion left(int size){
    	return new MyStringVersion(new String(charArray, 0, size));
    }
    
    public MyStringVersion left(){
    	return this.left(1);
    }
    
    public MyStringVersion right(int size){
    	return new MyStringVersion(new String(charArray, charArray.length-size, size));   
    }
    
    public MyStringVersion right(){
    	return this.right(1);
    }
    
    public MyStringVersion mid(int startPos, int size){
    	return new MyStringVersion(new String(charArray, startPos-1, size));   
    }
    
    public MyStringVersion mid(){
    	return this.mid(1, charArray.length);    	    	
    }
    
    public MyStringVersion subString(int startPos, int endPos){
    	return new MyStringVersion(new String(charArray, startPos-1, endPos));   
    }
    public MyStringVersion charAtPos(int pos){
    	return new MyStringVersion(new String(charArray, pos-1, 1));   
    }
        
 /*   public MyStringVersion instr(String searchstring, int startPos){
    	return new MyStringVersion(new String(charArray, searchstring, startPos-1));   
    }*/
    
    public MyStringVersion invert(){
    	char[] tempCharArray;
    	int strLen = charArray.length;
    	int counter = 0;
    	tempCharArray = new char[charArray.length];
    	for(int i=strLen; i<=0; strLen--){
    		tempCharArray[counter] = charArray[i];
    		counter++;
    	}
    	return new MyStringVersion(new String(tempCharArray));
    }
    public String toString(){
    	return new String(this.charArray, 0, this.charArray.length); 
    	//return "test";   	
    }
    public MyStringVersion upperCase(){
    	int ascii = 0;
    	for(int i=0; i<charArray.length; i++){
    		//charArray[i] =Character.toUpperCase(charArray[i]);
    		ascii = charArray[i];
    		if ((ascii >= 97) && (ascii <=122)) {
    			charArray[i] -= 32;
    		}
    	}
    	return this;
    }
 
    public MyStringVersion lowerCase(){
    	int ascii = 0;
    	for(int i=0; i<charArray.length; i++){
    		//charArray[i] =Character.toLowerCase(charArray[i]);
       		ascii = charArray[i];
    		if ((ascii >= 65) && (ascii <=90)) {
    			charArray[i] += 32;
    		}
    	}
    	return this;
    }
    
        
    public int length(){
    	return this.charArray.length;
    }
      
        
/*    public static void main(String []args){
       MyStringVersion myString = new MyStringVersion("Hello world!");
       System.out.println(myString.lowerCase());
    }*/
}