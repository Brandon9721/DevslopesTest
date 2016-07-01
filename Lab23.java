// class worksheet 
// lab 23.java
// Brandon Byrne  (20115464)  May 13, 2016

import java.util.*;

public class Lab23
{
	public static void main(String[] args)
	{
	// initialize variables
	int num1;
	Scanner userIn = new Scanner(System.in);
	
	
	// prompt user input and save it to num1
	System.out.print("\n\nPlease enter a positive integer between 1 to 7: ");
	num1 = userIn.nextInt();
	
	
	// a switch that detects users inputted number and print a corresponding day of the week depending
	// upon what number the user enters
	switch(num1)
	{
	case 1 : 
	System.out.println("\n\nMonday is the first day of the week.\n\n"); break;
	
	case 2 : 
	System.out.println("\n\nTuesday is the second day of the week.\n\n"); break;
	
	case 3 : 
	System.out.println("\n\nWednesday is the third day of the week.\n\n"); break;
	
	case 4 : 
	System.out.println("\n\nThursday is the fourth day of the week.\n\n"); break;
	
	case 5 : 
	System.out.println("\n\nFriday is the fifth day of the week.\n\n"); break;
	
	case 6 : 
	System.out.println("\n\nSaturday is the sixth day of the week.\n\n"); break;
	
	case 7 : 
	System.out.println("\n\nSunday is the seventh day of the week.\n\n"); break;
	
	default :
	System.out.println("\n\nPlease enter a valid number within 1 to 7\n\n"); break;
	}
	
	}
}