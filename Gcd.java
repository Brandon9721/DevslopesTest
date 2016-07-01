// Greatest Common Devisor
// Brandon Byrne (20115464)	May 17, 2016
import java.util.*;
public class Gcd
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numb1 = s.nextInt();
		System.out.print("Enter second number: ");
		int numb2 = s.nextInt();
		
		int remainder = numb1 % numb2;
		while(remainder != 0)
		{
			numb1 = numb2;
			numb2 = remainder;
			remainder = numb1 % numb2 ;
		}
		System.out.println("Gcd: " + numb2);
	}
}