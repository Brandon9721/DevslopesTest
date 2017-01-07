// CP1270 Lab32 
// Brandon Byrne (20115464)	May 19, 2016

// 6, 28, 496, and 8128 are perfect numbers... the larger perfect numbers take too long to
// load in this program

import java.util.Scanner;

public class Lab32
{	
	public static void main(String[] args)
	{
	
	// create variables
		int input;
		int divisor = 1;
		int result = 0;
		Scanner s = new Scanner(System.in);
		
		
		// get users number
		System.out.print("Enter number: ");
		input = s.nextInt();
		
		
		
		
		// start while loop to find the divisors of users number
		// run the while loop as long as user input is larger than the divisor found.
		// once it finds a divisor over the user number it stops looping
		while(input >= divisor)
		
		{
			
			
			if(input % divisor == 0)   // find out if the input can be divided evenly without remainders
			{
				
				System.out.print(divisor + ", ");  // visibly prints the divisor values so I can see what
													// can be divided into the inputted number
		
				result += divisor;	// keep adding new divisor values to end result
				
			}
			divisor++;  // increment divisor variable to loop
			
			
		}
		System.out.printf("%nsum = %d%n", result);  // print the sum of all divisors
		
		if(result == 2 * input)  // if the sum (2n) is equal to double the input (n) then it is perfect
		{
			System.out.printf("%n%n%d is a perfect number%n%n", input);
		}
		else  // otherwise it is not perfect
		{
			System.out.printf("%n%n%d is not a perfect number%n%n", input);
		}
		
	}
}
			
			
			