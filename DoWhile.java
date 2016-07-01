// DoWhile example
// Brandon Byrne (20115464)	May 18, 2016

import java.util.*;

public class DoWhile
{
	public static void main(String[] args)
	{
		int a, b;
		Scanner s = new Scanner(System.in);
		
		// code will execute code with the do loop at least once and will only loop again
		// if the while boolean expression at the end is true. Once it becomes false the do loop ends
		// and the program continues past the loop.
		do
		{
			System.out.print("Enter a: ");
			a = s.nextInt();
			System.out.print("Enter b: ");
			b = s.nextInt();
		} while (a < b);
	}
}