package review;

public class Map {

	private Point p1;
	
	Map()
	{
		this(new Point());
	}
	Map(Point pObj)
	{
		p1 = pObj;
	}
	Map(double f, double s)
	{
		p1 = new Point();
		p1.setX(f);
		p1.setY(s);
	}
	Map(Map m)
	{
		p1 = m.p1;
	}
	public void add()
	{
		double result = p1.getX() + p1.getY();
		System.out.println("Result (Map with two params): " + result);
	}
	public void add(double one, double two)
	{
		double result = one + two;
		System.out.println("Result (with two params): " + result);
	}
	public void add(Point p)
	{
		double result = p.getX() + p.getY();
		System.out.println("Result (with param as Points): " + result);		
	}
	public void delete(double one, double two)
	{
		
	}
	public void delete(Point p)
	{
		
	}
	public void remove(double one, double two)
	{
		
	}
	public void remove(Point p)
	{
		
	}
	public void sort()
	{
		
	}
	public boolean hasNext()
	{
		return true;
	}
	public Point getNext()
	{
		return p1;
	}
}
