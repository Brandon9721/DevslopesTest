// Lab 21 Due October 10
// Brandon Byrne (20115464)	Sept. 30, 2016
import java.util.Scanner;
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
		String s = "(" + x + "," + y + ")";
		return s;
	}
}

class Circle
{
	private Point center = new Point();
	private int radius;
	
	public Circle()
	{
		radius = 1;
	}
	
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	public Circle(Point center)
	{
		this.center = center;
		radius = 1;
	}
	
	public Circle(int radius, Point center)
	{
		this.radius = radius;
		this.center = center;
	}
	
	public double area()
	{
		double area = (radius * radius) * Math.PI;
		return area;
	}
	
	public double circumference()
	{
		double circum = 2 * Math.PI * radius;
		return circum;
	}
	
	public String toString()
	{
		String S = "Radius: " + radius + "   Center: " + center + "\n"
		 + "Area: " + area() + "   Circumference: " + circumference() + "\n";
		return S;
	}
}


class Lab21
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Point A = new Point();
		Point B = new Point(5,10);
		Point C = new Point(1,2);
		Point D = new Point(5*5,200/5);
		System.out.println("\nORIGINAL POINTS:\n\nPoint A: " + A + "\n" + "Point B: " + B + 
			"\n" + "Point C: " + C + "\n" + "Point D: " + D);
		// creates new points
		System.out.println();
		
		A.move(12,34);
		B.move(99,100);
		C.move(33,50);
		D.move(10,43);
		System.out.println("MOVED POINTS: " + "\n");
		System.out.println("Point A: " + A + "\n" + "Point B: " + B + "\n" + "Point C: " + C + "\n" + "Point D: " + D);
		System.out.println();
		
		Circle c1 = new Circle();
		System.out.println("Circle 1:		(Default Circle)\n" + c1);
		System.out.println();
		
		Circle c2 = new Circle(7);
		System.out.println("Circle 2:		(Circle with given only a radius (7))\n" + c2);
		System.out.println();
		
		Circle c3 = new Circle(C);
		System.out.println("Circle 3:		(Circle given only Point C)\n" + c3);
		System.out.println();
		
		Circle c4 = new Circle(5,B);
		System.out.println("Circle 4:		(Circle given both a radius of 5 and Point B)\n" + c4);
		System.out.println();
		
		System.out.print("Create your own circle!  (Integers only!)\nEnter value for radius: " );
		int r = s.nextInt();
		System.out.print("Enter point value for x coordinate: ");
		int x = s.nextInt();
		System.out.print("Enter point value for y coordinate: ");
		int y = s.nextInt();
		Point Z = new Point(x,y);
		System.out.println();
		
		Circle c5 = new Circle(r,Z);
		System.out.println(c5);
		System.out.println();
        
        System.out.println("Move the center point for your circle");
        System.out.print("New x value: ");
        x = s.nextInt();
        System.out.print("New y value: ");
        y = s.nextInt();
        System.out.println();
        
        Z.move(x,y);
        System.out.println(c5);
        System.out.println();
    
		
	
		
	}
}


class testCircle
{
    public static void main(String[] args);
    {
        
        
    }
}

