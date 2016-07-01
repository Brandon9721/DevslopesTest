// class worksheet 
// lab 22.java
// Brandon Byrne (20115464)  May 13, 2016

import java.util.*;

public class Lab22
{
	public static void main(String[] args)
	{
		// initialize variables
		int num1;
		Scanner userIn = new Scanner(System.in);
		
		
		System.out.print("\n\nEnter students overall grade: ");  // prompt and save the users number
		num1 = userIn.nextInt();
		
		
		
		// if and else if's that print out some text depending on the grade that was entered
		if (num1 >= 85 && num1 <= 100)
		{
			System.out.println("\n\nThe student achieved an 'A'\n\n");
		}
		
		else if (num1 < 85 && num1 >= 65)
		{
			System.out.println("\n\nThe student achieved a 'B'\n\n");
		}
		
		else if (num1 < 65 && num1 >= 55)
		{
			System.out.println("\n\nThe student achieved a 'C'\n\n");
		}
		
		else if (num1 < 55 && num1 >= 50)
		{
			System.out.println("\n\nThe student achieved a 'D'\n\n");
		}
		
		else if (num1 < 50 && num1 >= 0)
		{
			System.out.println("\n\nThe student has failed the program and receives an 'F'\n\n");
		}
		
		else
		{
			System.out.println("\n\nPlease enter a valid integer between 0-100\n\n");
		}
		
		
	}
}