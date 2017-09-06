package p2_2;

import java.awt.Rectangle;

public class PerimeterTester {

	public static void main(String[] args) {
		//Rectangle(x,y, width, height);
		//Perimeter of Rectangle = 2 X (L + W)
		Rectangle myRectangle = new Rectangle(75,75, 50, 50);
		double width = myRectangle.getWidth();
		double height = myRectangle.getHeight();
		double perimeter = 2 * (width + height);
		System.out.println("Perimeter of Rectangle: " + perimeter);

	}
}
