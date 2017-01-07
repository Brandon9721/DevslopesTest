// class worksheet 
// lab 21.java
// Brandon Byrne  (20115464) May 13, 2016

import java.util.*;

public class Lab21
{	
	public static void main(String[] args)
	{
		// initialize variables
		Scanner userInput = new Scanner(System.in);
		int numb1;
		int zero = 0;
		
		System.out.println("\nPlease enter an integer value\n");
		numb1 = userInput.nextInt();   // prompts and saves users input
		
		if (numb1 > 0)  // if user input is >0 print this statement
		{
			System.out.printf("%n%d is greater than 0%n%n", numb1);	
		}
		
		else if (numb1 == 0) // else if user input = 0 then print this statement
		{
			System.out.printf("%d is equal to 0%n%n", numb1);
		}
		
		else // otherwise print this statement
		{
			System.out.printf("%d is less than 0%n%n", numb1);
		}
	}
}