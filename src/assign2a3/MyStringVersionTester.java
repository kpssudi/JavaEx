package assign2a3;

public class MyStringVersionTester {

	public static void main(String[] args) {
		String myString = new String("Computer");
		MyStringVersion myText2 = new MyStringVersion();
		MyStringVersion myText = new MyStringVersion(myString);
		MyStringVersion myText1 = new MyStringVersion(myText);

		System.out.println("Using default constructor:\n");
		System.out.printf("\tExtracted text from left (default): %s\n\n", myText2.left());

		System.out.println("Using parameterized constructor:\n");
		System.out.printf("\tExtracted text from left: %s\n", myText.left(3));
		System.out.printf("\tExtracted text from right (default): %s\n", myText.right());
		System.out.printf("\tExtracted text from right: %s\n", myText.right(3));
		System.out.printf("\tExtracted text from mid (default): %s\n", myText.mid());
		System.out.printf("\tExtracted text from mid: %s\n", myText.mid(2,5));
		System.out.printf("\tSubstring from text: %s\n", myText.subString(4, 3));
		System.out.printf("\tCharacter at position: %s\n", myText.charAtPos(3));
		System.out.printf("\tChanging text to upper case: %s\n", myText.upperCase());
		System.out.printf("\tChanging text to lower case: %s\n\n", myText.lowerCase());

		System.out.println("Using copy constructor:\n");
		System.out.printf("\tSearch text: %s\n", myText1.instr("put", 4));
		System.out.printf("\tInverted text: %s\n", myText1.invert());
		
	}

}
