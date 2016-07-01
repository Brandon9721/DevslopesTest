//	Programming Fundamentals Lab 1
//	I/O and Arithmetic
//	Brandon Byrne (20115464)	May 12, 2016

import java.util.Scanner;	// imports Scanner 
public class Lab12  // declare class name
{	
	public static void main(String[] args)	// declare main method
	{	
	// declare variables
	int anyInt;
	char character1;
	double anotherNumber;
	
	Scanner userInput = new Scanner(System.in);		// create Scanner method
	
	//obtain user input for the variable values
	System.out.println("Please enter an integer value:");
	anyInt = userInput.nextInt();
	
	System.out.printf("%nPlease enter any character:%n");
	character1 = userInput.next().charAt(0);
	
	System.out.println("\nPlease enter another number value (Decimals are permitted):%n");
	anotherNumber = userInput.nextDouble();
	
	//print out user inputs
	System.out.printf("%nThe first number that you entered was %d, and the second number was %f.%n", anyInt, anotherNumber);
	System.out.printf("The character that you entered was %c.%n%n", character1);
	
	
	}
}
	
	