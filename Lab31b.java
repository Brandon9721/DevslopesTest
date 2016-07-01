// CP1270 Lab31b 
// Brandon Byrne (20115464)	May 19, 2016


// import needed java utilities
import java.util.Scanner;
import static java.lang.System.out;
import  java.lang.Math;

public class Lab31b  // declare class
{
	public static void main(String[] args)  // start main function or method
	{
		double n;
		double sum;
		double result = 0;
	
		Scanner userInput = new Scanner(System.in);
		
		out.print("\nPlease enter a number: ");
				n = userInput.nextDouble();  // grab number from user and stores into variable 'n'
		
		for(int i = 0; i <= n; i++)  // start for loop that will continue to loop until i <= users number
		{
				
			
				sum = i * Math.pow(-1, i - 1);  // formula for alternating series
			 result += sum;  // result adds each value of sum every loop and stores that value
			
		}
			
				out.printf("%nThe sum of the alternating series is %.0f%n%n", result);  
					// prints value of the result

	}
			
			
			
			
}
