// CP1340z Arrays and Strings
// Brandon Byrne (20115464) Sept 12, 2016
public class arrays
{
	public static void main(String[] args)
	{
		int[] array = new int[1000];  // an array of 1000 elements, elements not set yet
		
		init(array);  // method that will set / initialize each array element
		
		findPrimes(array);  // method that will search through array and find the prime numbers
		
		printPrimes(array);  // method that will print each prime it finds to screen
	}
	
	
	public static void init(int[] array)
	{
		for (int i = 2; i < array.length; i++)
		{
			array[i] = 1;
		}
		
		// loops and sets each number of the array from 0 to 1000.
	}
	
	public static void findPrimes(int[] array)
	{
		for(int i = 2; i < array.length; i++)
		{
			if(array[i] == 1)
			{
				for(int j = i * 2; j < 1000; j += i)   // eratosthenes algorithm where any multiples of a number get removed or in this							
				{									   // case gets changed to a '0' to be ignored when printing.
					array[j] = 0;
				}
			}
		}
	}
	
	public static void printPrimes(int[] array)  // method that will print primes to the command line
	{
		for(int x = 0; x < array.length; x++)
		{
			if(array[x] != 0)
			{
				System.out.println(x);
			}
		}
	}
}



















