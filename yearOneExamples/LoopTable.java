//	while loop exercise
// 	Brandon Byrne (20115464)	May 17, 2016

import java.util.*;

public class LoopTable
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	int n;
		int i = 1;
		
		System.out.print("Enter N: ");
		n = s.nextInt();
		System.out.printf("%n%n# of loops	N * 10		N * 100		N * 1000%n%n");
		
		while (i <= 5) 
		{
			System.out.printf("%n%d		%d		%d		%d%n%n",i, (n * i * 10), (n * i * 100), (n * i * 1000));
			i++;
		}
		System.out.println();
	}
}