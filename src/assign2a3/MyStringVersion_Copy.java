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
public class MyStringVersion_Copy{
    private char[] charArray;
    
    public MyStringVersion_Copy(){
    	this("");
    }
    public MyStringVersion_Copy(String inputJavaString){
    	charArray = new char[inputJavaString.length()];
    	
 /*   	for(int i=0; i<inputJavaString.length(); i++){
    		charArray[i] = inputJavaString.charAt(i);
    	}*/
    	charArray = inputJavaString.toCharArray();
    }
    public MyStringVersion_Copy(MyStringVersion_Copy S){
    	charArray = S.charArray;
    }

    public MyStringVersion_Copy left(int size){
    	return new MyStringVersion_Copy(new String(charArray, 0, size));
    }
    
    public MyStringVersion_Copy left(){
    	return this.left(1);
    }
    
    public MyStringVersion_Copy right(int size){
    	return new MyStringVersion_Copy(new String(charArray, charArray.length-size, size));   
    }
    
    public MyStringVersion_Copy right(){
    	return this.right(1);
    }
    
    public MyStringVersion_Copy mid(int startPos, int size){
    	return new MyStringVersion_Copy(new String(charArray, startPos-1, size));   
    }
    
    public MyStringVersion_Copy mid(){
    	return this.mid(1, charArray.length);    	    	
    }
    
    public MyStringVersion_Copy subString(int startPos, int endPos){
    	return new MyStringVersion_Copy(new String(charArray, startPos-1, endPos));   
    }
    public MyStringVersion_Copy charAtPos(int pos){
    	return new MyStringVersion_Copy(new String(charArray, pos-1, 1));   
    }
        
 /*   public MyStringVersion instr(String searchstring, int startPos){
    	return new MyStringVersion(new String(charArray, searchstring, startPos-1));   
    }*/
    
    public MyStringVersion_Copy invert(){
    	char[] tempCharArray;
    	int strLen = charArray.length;
    	int counter = 0;
    	tempCharArray = new char[charArray.length];
    	for(int i=strLen; i<=0; strLen--){
    		tempCharArray[counter] = charArray[i];
    		counter++;
    	}
    	return new MyStringVersion_Copy(new String(tempCharArray));
    }
    public String toString(){
    	return new String(this.charArray, 0, this.charArray.length); 
    	//return "test";   	
    }
    public MyStringVersion_Copy upperCase(){
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
 
    public MyStringVersion_Copy lowerCase(){
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