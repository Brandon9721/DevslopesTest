// Fig 2.15  Arithmetic
import java.util.Scanner;

public class Arithmetic
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		int Numb1;
		int Numb2;
		String Operation;
		int sum;
		int product;
		int difference;
		int quotient;
		
		
		System.out.print("Enter your first integer ");
		
			Numb1 = userInput.nextInt();
		
		System.out.print("Enter you second integer ");
		
			Numb2 = userInput.nextInt();
		
		System.out.println("What would you like to do to these numbers?");
		System.out.print("Add, Subtract, Multiply, or Divide \n");
			
			Operation = userInput.next();
		
		
		sum = Numb1 + Numb2;
		product = Numb1 * Numb2;
		difference = Numb1 - Numb2;
		quotient = Numb1 / Numb2;
		
		
		if (Operation.equals("Add"))
		{ 
			System.out.printf("%d + %d = %d%n", Numb1, Numb2, sum);
		}
		
		if (Operation.equals("Subtract"))
		{
			System.out.printf("%d - %d = %d%n:", Numb1, Numb2, difference);
		}
		
		if (Operation.equals("Multiply"))
		{
			System.out.printf("%d * %d = %d%n", Numb1, Numb2, product);
		}
		
		if (Operation.equals("Divide"))
		{
			System.out.printf("%d / %d = %d%n with %d left over%n", Numb1, Numb2, quotient, (Numb1 % Numb2));
		}
		
	
		
	}
}