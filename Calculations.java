import java.util.Scanner; 
// imports java scanner

public class Calculations
{
	
	//	main method begins execution of Java Application
	public static void main(String[] args)
	{
		//create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		int number1;  		// first number to add
		int number2; 		// second number to add
		int number3;
		int sum;  			// sum of number 1 and number 2
		int subtraction;		// difference of both variables
		int multiplication;	// product of both variables
		int division;		// quotient of both variables
		
		
		System.out.print("Enter first integer: ");  // prompt
		number1 = input.nextInt();   // read first number from users input
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();	// read the second number from users input
		
		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		
			sum = number1 + number2 + number3;  // add numbers, then stores the total in variable sum
			subtraction = number1 - number2 - number3;		//  subtract numbers and stores as subtraction
			multiplication = number1 * number2 * number3;	// multiply numbers and stores as multiplication
			division = number1 / number2 / number3;		// divides numbers and stores as division
		
		
		System.out.printf("The sum is %d%n", sum);  // displays the sum
		
		System.out.printf("The difference is %d%n", subtraction);  // displays the sum
		
		System.out.printf("The product is %d%n", multiplication);  // displays the sum
		
		System.out.printf("The quotient is %d%n", division);  // displays the sum
		
		
		
	}  // ends the main method
}	// ends the class called addition

