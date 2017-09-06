package p2_1;
import java.awt.Rectangle;

public class AreaTester {

	public static void main(String[] args) {
		//Rectangle(x,y, width, height);
		//Area of Rectangle = L X W
		Rectangle myRectangle = new Rectangle(75,75, 50, 50);
		double width = myRectangle.getWidth();
		double height = myRectangle.getHeight();
		double area = width * height;
		System.out.println("Area of Rectangle: " + area);
	}

}
