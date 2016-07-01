// Fig 2.16 and 2.17

import java.util.Scanner;	//import scanner

public class Arithmetic2	//declare class name
{
	public static void main(String[] args)	//declare main method
	{	
		Scanner UserInput = new Scanner(System.in);		//enable the scanner
		
		
		//initialize variables
		int Number1;
		int Number2;
		int Number3;
		int sum;
		int average;
		int product;

		

		//obtain user input
		System.out.println("Please enter first integer ");
		Number1 = UserInput.nextInt();
		
		System.out.println("Please enter the second integer ");
		Number2 = UserInput.nextInt();
		
		System.out.println("Please enter the third integer ");
		Number3 = UserInput.nextInt();
		
		//calculate user input
		sum = Number1 + Number2 + Number3;
		product = Number1 * Number2 * Number3;
		
		//print out results
		System.out.printf("The sum is = %d%n", (Number1 + Number2 + Number3));
		System.out.printf("The average is = %d%n", (sum / 3));
		System.out.printf("the product is = %d%n", product);
	
	
	//print out the largest integer from user input
	if (Number1 > Number2)
	{ if (Number1 > Number3)
		
			{	
				System.out.printf("%d is the largest!%n", Number1);
			}
			
		else
		{
			System.out.printf("%d is the largest!%n", Number3);
		}
	}
			
	else if (Number2 > Number3)
		
			{	
						System.out.printf("%d is the largest!%n", Number2);
			}	
			
		
	else
		{	
			System.out.printf("%d is the largest!%n", Number3);
		}
		
		
		
		
		
		
		
		//print out the smallest integer from user input
		if (Number1 < Number2)
		{ if (Number1 < Number3)
		
			{	
				System.out.printf("%d is the smallest!%n", Number1);
			}
		else
		{
			System.out.printf("%d is the smallest!%n", Number3);
		}
		
		
		
		
		}
			
	else if (Number2 < Number3)
		
			{	
						System.out.printf("%d is the smallest!%n", Number2);
			}	
			
		
		
		
	else
		{	
			System.out.printf("%d is the smallest!%n", Number3);
		}
		

	}
}
		