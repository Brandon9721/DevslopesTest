// Lab52.java
//  Brandon Byrne (20115464)	June 2, 2016

import java.util.*;

public class Lab52	
{
	public static void main(String[] args)
	{
		int numb[] = new int[5];
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("Please enter 5 integers:");  // prompt for user to input 5 integers
		
		for(int i = 0; i < 5; i++) // loop that assigns each integer to a slot in the array
		{
			numb[i] = userInput.nextInt();
			
		}
		
		System.out.printf("The sum of those 5 integers are: %d %n%n", sum(numb)); // call sum method
		
		System.out.printf("The largest integer you entered was: %d %n%n", findLargest(numb)); // call findLargest method
	
		System.out.printf("The smallest integer you entered was: %d %n%n", findSmallest(numb));  // call findSmallest method
	} // end of main method

	

	public static int sum(int numb[]) // function that adds each element of the array
	{
		int totalSum = numb[0] + numb[1] + numb[2] + numb[3] + numb[4];
		return totalSum;
	} // end sum method
	
	
	
	public static int findLargest(int numb[])   // function that finds the largest out of the users numbers
	{
		int Largest = numb[0];
		for (int i = 0; i < 5; i++)
		{
			if(numb[i] > Largest)  // during loop it checks each number to the current largest 
								   // if it is larger than 'Largest' then that number gets assigned to Largest
			{
				Largest = numb[i];
			}
		}
		return Largest;
	} // end findLargest method
	
	
	public static int findSmallest(int numb[])   // function that finds the smallest out of the users numbers
	{
		int Smallest = numb[0];
		for (int i = 0; i < 5; i++)
		{
			if (numb[i] < Smallest)		// during loop it checks each number to the current smallest
								   		// if it is larger than 'Smallest' then that number gets assigned to Smallest
			{
				Smallest = numb[i];
			}
		}
		return Smallest;
	} // end findSmallest method


} // end class file
	
			