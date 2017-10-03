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
    	
    }
    public MyStringVersion(String inputJavaString){
    	charArray = new char[inputJavaString.length()];
    	for(int i=0; i<inputJavaString.length(); i++){
    		charArray[i] = inputJavaString.charAt(i);
    	}
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
    
    public String toString(){
    	return new String(this.charArray, 0, this.charArray.length); 
    	//return "test";   	
    }
    
 /*   public MyStringVersion upperCase(){
    	for(int i=0; i<charArray.length; i++){
    		charArray[i] =Character.toUpperCase(charArray[i]);
    	}
    	return this;
    }*/
    public MyStringVersion upperCase(){
    	//char temp = ' ';
    	for(int i=0; i<charArray.length; i++){
    		//charArray[i] = Character.toUpperCase(charArray[i]);
    		//temp = charArray.charAt(i);
    		
	}
	return this;
}
    
    public MyStringVersion lowerCase(){
    	for(int i=0; i<charArray.length; i++){
    		charArray[i] =Character.toLowerCase(charArray[i]);
    	}
    	return this;
    }
    
        
    public int length(){
    	return this.charArray.length;
    }
      
        
    public static void main(String []args){
       MyStringVersion myString = new MyStringVersion("Hello world!");
       System.out.println(myString.lowerCase());
    }
}