// rectangle class will use the "Point class" from Point.java in same directory
// Brandon Byrne (20115464) 	Sept. 20, 2016

class Rectangle
{
	protected int width, height;
	protected Point origin;
	
	public Rectangle()	
	{
		width = height = 10;
		origin = new Point();
	}
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
		origin = new Point();
	}
	
	public Rectangle(Point origin)
	{
		width = height = 10;
		this.origin = origin;
	}
	
	public Rectangle(int width, int height, Point origin)
	{
		this.width = width;
		this.height = height;
		this.origin = origin;
	}
	
	public String toString()
	{
		String s = origin.toString() + " width: " + width + " height: " + height;
		return s;
	}
	
	public void move(int x, int y)
	{
		origin.move(x, y);
	}
	
	public void resize(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Rectangle r)
	{
		if(this.origin.equals(r.origin) && 
			this.width == r.width &&
			this.height == r.height)
				return true;
		else
			return false;
	}
}

class Square extends Rectangle
{
	private int side;
	
	public Square(int side)
	{
		super(side, side);
		this.side = side;
	}
	
	public Square(int side, Point origin)
	{
		super(side, side, origin);
		this.side = side;
	}

	public double diagonal()
	{
		return Math.sqrt(2 * side * side);
	}
	
	public void resize(int side)
	{
		this.side = side;
		this.width = this.height = this.side;
	}
}

class TestSquare
{
	public static void main(String[] args)
	{
		Square s1 = new Square(4);
		
		Point p = new Point(3,4);
		
		Square s2 = new Square(5, p);
		
		System.out.println(s1);
		System.out.println(s2);
		
		s2.move(0,0);
		System.out.println(s2);
		
		System.out.println(s2.width + " " + s2.height);
		
		if(s1.equals(s2))
			System.out.println("Same");
		else
			System.out.println("Different");
			
		s1.resize(5);
		if(s1.equals(s2))
			System.out.println("Same");
		else
			System.out.println("Different");
			
		
	}
}