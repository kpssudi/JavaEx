package assign2a3;

public class MyStringVersionTester {

	public static void main(String[] args) {
		String myString = new String("Computer");
		MyStringVersion myText = new MyStringVersion(myString);
		System.out.printf("Extracted text from left (default): %s\n", myText.left());
		System.out.printf("Extracted text from left: %s\n", myText.left(3));
		System.out.printf("Extracted text from right (default): %s\n", myText.right());
		System.out.printf("Extracted text from right: %s\n", myText.right(3));
		System.out.printf("Extracted text from mid (default): %s\n", myText.mid());
		System.out.printf("Extracted text from mid: %s\n", myText.mid(2,5));
		
	}

}
