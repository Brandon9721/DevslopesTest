// Fibonacci sequence
// Brandon Byrne (20115464)	May 17, 2016

import java.util.*;

public class FibSeq
{	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double prev = 0; double temp = 1;
		double next;
		
		for(int i = 1; i <= n; i++)
		{
			next = prev + temp;
			System.out.print(next + " ");
			prev = temp; temp = next;
		}
		System.out.println();
	}
}