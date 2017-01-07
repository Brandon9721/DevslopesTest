// Lab 41.java
// Brandon Byrne (20115464)	May 2016

import java.util.Scanner;

// start public class Lab41.java
public class Lab41
{
	// start main method
	public static void main(String[] args)
	{
		// initialize variables and scanner
		Scanner userInput = new Scanner(System.in);
		int numb1;
		int i = 0;
		
		// program loops 3 times just so I dont need to type java Lab41 every time I go to test the program multiple times
		while (i < 3)
		{
			System.out.println("\nPlease enter a positive integer:");
			numb1 = userInput.nextInt(); // grabs users number and stores it in numb1

			boolean result = evenCheck(numb1); // variable result calls the function evenCheck and
											// gives the function the users number to be used in calculation

			if (result == true) // if the function below determines it is even and returns true
								// this will print out saying it is even
			{
				System.out.println("Your number is even!\n");
				i++; // increments 'i' so loop will end once i < 3
			}
			
			else // otherwise it prints that it is odd
			{
				System.out.println("Your number is odd\n");
				i++;
			}
		} // end while loop

	} // end main method

// start evenCheck's function
public static boolean evenCheck(int numb1)
	{
		if (numb1 % 2 == 0) // if it can divide evenly with 2 with no remainder then it is an even number
							// it will return as true
		{
			return true;
		}
	
		else 
		{
			return false; // otherwise the number is odd so it returns as false
		}
	} // end of evenCheck function

} // end public class Lab41.java