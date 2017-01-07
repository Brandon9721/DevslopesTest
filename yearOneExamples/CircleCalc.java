// Class exercise Circle calculations
import java.util.Scanner;


public class CircleCalc
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		
		int Radius;
		
		System.out.println("Please enter the radius of the circle");
		Radius = userInput.nextInt();
		
		System.out.printf("The diameter of the circe is %d%n%n", (Radius * 2));
			// diameter = radius * 2
	
		System.out.printf("The area of the circle is %f%n%n", (Math.PI * Radius * Radius));
			// area = PI * R * R
		
		System.out.printf("The circumference of the circle is %f%n%n", (2 * Math.PI * Radius));
			// circumference = 2 * PI * radius
	
	
	System.out.println(0 % 5);
	}
}