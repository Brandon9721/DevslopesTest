// BinarySearch.java
// Brandon Byrne (20115464) June 1, 2016

import java.util.*;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] n = {1,2,3,4,5,6,7};
		Scanner s = new Scanner(System.in);
	
		System.out.print("Enter target: ");
		int target = s.nextInt();
	
		if(binSearch(n, target))
			System.out.println(target + " is in the array.");
		
		else
			System.out.println(target + " is not in the array");
	}
	
	public static boolean binSearch(int[] n, int target)
	{
		int start = 0; int end = n.length - 1;
		int middle = (start + end) / 2;
		boolean found = false;
		
		while(start <= end && !found)
		{
			if(target == n[middle])
			found = true;
			
			else if(target < n[middle])
			{
				end = middle - 1;
				middle = (start + end) / 2;
			}
			
			
			else
			{
				start = middle + 1;
				middle = (start + end) / 2;
			}
		}
		return found;
	}
}
