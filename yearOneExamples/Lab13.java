//	Programming Fundamentals Lab 1
//	I/O and Arithmetic
//	Brandon Byrne (20115464)	May 12, 2016

import java.util.Scanner;	// imports Scanner 
public class Lab13  // declare class name
{	
	public static void main(String[] args)	// declare main method
	{	
	// declare variables
	int firstInt;
	int secondInt;
	int sum;
	int product;
	int difference;
	int quotient;
	String operation;
	
	
	Scanner userInput = new Scanner(System.in);		// create Scanner method
	
	//obtain user input for the variable values
	System.out.println("\nPlease enter the first integer:");
	firstInt = userInput.nextInt();
	
	
	System.out.println("\nPlease enter another integer:");
	secondInt = userInput.nextInt();
	
	System.out.println("\nWhat would you like to do to these numbers?");
	System.out.print("'Add', 'Subtract', 'Multiply', 'Divide', or show 'All' results at once:\n\n");
			
		//Scans for string characters	
		operation = userInput.next();
	
	// takes user input and calculates the values for variables
	sum = firstInt + secondInt;
	product = firstInt * secondInt;
	difference = firstInt - secondInt;
	quotient = firstInt / secondInt;
	
	
	// depending on the operation the user requested
	// a different set of text and results print out
	
	// 'All' will print out all results for each operation
	if (operation.equals("All"))
		{ 
			System.out.printf("%n%d + %d = %d%n%n", firstInt, secondInt, sum);
			System.out.printf("%d - %d = %d%n%n", firstInt, secondInt, difference);
			System.out.printf("%d * %d = %d%n%n", firstInt, secondInt, product);
			System.out.printf("%d / %d = %d with %d remaining%n%n", firstInt, secondInt, quotient, (firstInt % secondInt));
		}
	
	// 'Add prints the sum
		if (operation.equals("Add"))
		{ 
			System.out.printf("%n%d + %d = %d%n%n", firstInt, secondInt, sum);
		}
		
	//	'Subtract' prints the difference
	if (operation.equals("Subtract"))
		{
			System.out.printf("%n%d - %d = %d%n%n:", firstInt, secondInt, difference);
		}
		
	//	'Multiply' prints the product	
	if (operation.equals("Multiply"))
		{
			System.out.printf("%n%d * %d = %d%n%n", firstInt, secondInt, product);
		}
		
	//	'Divide' prints the quotient along with the remainder
	if (operation.equals("Divide"))
		{
			System.out.printf("%n%d / %d = %d with %d reamining%n%n", firstInt, secondInt, quotient, (firstInt % secondInt));
		}
	
	
	
	}
}
	
	