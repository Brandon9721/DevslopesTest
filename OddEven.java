// Class exercise odd or even
// May 10, 2016
import java.util.Scanner;

public class OddEven
{
	public static void main(String[] args)
	{
		
		Scanner userInput = new Scanner(System.in);
		
		int userNumb;
		int result;
		
		
		
		System.out.println("Please enter an integer");
		userNumb = userInput.nextInt(); 
		
		result = userNumb % 2;
		
		
	
	
		if (result == 0)
		{
			System.out.printf("The number %d is even!%n", userNumb);
		}
		
		else 
		{
			System.out.printf("The number %d is odd!%n", userNumb);
		}
	
	
	}
	
}

