//Type in and run the following program:
//Then modify the program to show the message "Hello, name!", displaying the name that the user typed in.

package p1_8;
import javax.swing.JOptionPane;

public class DialogTester {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello " + name + "!");
		System.exit(0);
	}
}
