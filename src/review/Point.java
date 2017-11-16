package review;

public class Point {
	private double x, y;
	
	Point()
	{
		this(0,0);		
	}
	Point (double first)
	{
		x = first;
		y = 0;
	}
	Point (double first, double second)
	{
		x = first;
		y = second;
		String S = "Hi";
		char s = S;
	}
	Point(Point p)
	{
		x = p.x;
		y = p.y;
	}
	public void setX(double f)
	{
		x = f;
	}
	public void setY(double s)
	{
		y = s;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
}
