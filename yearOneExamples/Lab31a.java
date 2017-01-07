// CP1270  Lab31b.java
//	Brandon Byrne (20115464) 	May 19, 2016

//import needed java utilities
import java.util.Scanner;
import static java.lang.System.out;

public class Lab31a
{
	public static void main(String[] args)  // start main method
	{
		int numb;
		int digits;
		Scanner userInput = new Scanner(System.in);
		// create variables and scanner
		
		
		out.print("Please enter a number: ");
		numb = userInput.nextInt(); // store users inputted number into 'numb' variable
		
		while(numb != 0)  // will continue to loop until user enters '0'
						  // the if statements will determine the number of digits and print out the
						  // number of digits 
						  // the loop will end once user inputs '0'
		{
			if (numb >= 1 && numb < 10)
			{
				out.println(numb + " has 1 digit\n");
				numb = userInput.nextInt();
			}
			if (numb >= 10 && numb < 100)
			{
				out.println(numb + " has 2 digits\n");
				numb = userInput.nextInt();
			}
			
			if (numb >= 100 && numb < 1000)
			{
				out.println(numb + " has 3 digits\n");
				numb = userInput.nextInt();
			}
			
			if (numb >= 1000 && numb < 10000)
			{
				out.println(numb + " has 4 digits\n");
				numb = userInput.nextInt();
			}
			
			 if (numb >= 10000 && numb < 100000)
			{
				out.println(numb + " has 5 digits\n");
				numb = userInput.nextInt();
			}
			
			 if (numb >= 100000 && numb < 10000000)
			{
				out.println(numb + " has 6 digits\n");
				numb = userInput.nextInt();
			}
			
			 if (numb >= 1000000 && numb < 10000000)
			{
				out.println(numb + " has 7 digits\n");
				numb = userInput.nextInt();
			}
			
			 if (numb >= 10000000 && numb < 100000000)
			{
				out.println(numb + " has 8 digits\n");
				numb = userInput.nextInt();
			}
			
			 if (numb >= 100000000 && numb < 1000000000)
			{
				out.println(numb + " has 9 digits\n");
				numb = userInput.nextInt();
			}
			
			if (numb >= 1000000000 && numb < 2147000001)
			{
				out.println(numb + " has 10 digits\n");
				numb = userInput.nextInt();
			}
			
			else if (numb < 0)  // if a negative number is added it will ask user to enter a positive number
			{
				System.out.println("Enter a positive number");
				numb = userInput.nextInt();
			}
			
			
			
		}
	} // end main method
} // end public class
	