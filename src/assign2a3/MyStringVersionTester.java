package assign2a3;

public class MyStringVersionTester {

	public static void main(String[] args) {
		String myString = new String("Computer");
		MyStringVersion myText = new MyStringVersion(myString);
		MyStringVersion myText1 = new MyStringVersion(myText);
		
		System.out.println("Using parameterized constructor:\n");
		System.out.printf("Extracted text from left (default): %s\n", myText.left());
		System.out.printf("Extracted text from left: %s\n", myText.left(3));
		System.out.printf("Extracted text from right (default): %s\n", myText.right());
		System.out.printf("Extracted text from right: %s\n", myText.right(3));
		System.out.printf("Extracted text from mid (default): %s\n", myText.mid());
		System.out.printf("Extracted text from mid: %s\n", myText.mid(2,5));
		System.out.printf("Inverted text: %s\n", myText.invert());
		System.out.printf("Substring from text: %s\n", myText.subString(4, 3));
		System.out.printf("Character at position: %s\n", myText.charAtPos(3));
		System.out.printf("Changing text to upper case: %s\n", myText.upperCase());
		System.out.printf("Changing text to lower case: %s\n\n", myText.lowerCase());

		System.out.println("Using copy constructor:\n");
		System.out.printf("Extracted text from left (default): %s\n", myText1.left());
		System.out.printf("Extracted text from left: %s\n", myText1.left(4));
		System.out.printf("Extracted text from right (default): %s\n", myText1.right());
		System.out.printf("Extracted text from right: %s\n", myText1.right(4));
		System.out.printf("Extracted text from mid (default): %s\n", myText1.mid());
		System.out.printf("Extracted text from mid: %s\n", myText1.mid(3,6));
		System.out.printf("Changing text to upper case: %s\n", myText1.upperCase());
		System.out.printf("Changing text to lower case: %s\n", myText1.lowerCase());
		
	}

}
