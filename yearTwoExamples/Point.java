// coordinate points
// Brandon Byrne (20115464)	Sept 19, 2016

class Point
{
	private int x, y;
	
	public Point()
	{
		x = y = 0;
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		String s = "x: " + x + " y: " + y;
		return s;
	}
	
	public boolean equals(Point p)
	{
		if(this.x == p.x && this.y == p.y)
			return true;
		else
			return false;
	}
}

class TestPoint
{
	public static void main(String[] args)
	{
		Point p = new Point();
		Point q = new Point(1,3);
		
	
		p.move(1,3);
		
		System.out.println(p);
		System.out.println(q); 
		
		//System.out.println("x coordinate of p: " + p.x);
		
		if(p.equals(q))
			System.out.println("Same");
		else
			System.out.println("Different");
			
		p.move(5,4);
			
		System.out.println(p);
		System.out.println(q); 
		if(p.equals(q))
			System.out.println("Same");
		else
			System.out.println("Different");
		
	}
}