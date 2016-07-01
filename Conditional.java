// conditional operator test
// Brandon Byrne (20115464)	May 27, 2106

import java.util.Scanner;

public class Conditional 
{
	public static void main(String[] args)
	{
		int grade;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter your grade: ");
		grade = userInput.nextInt();
		
		System.out.println(grade >= 60 ? "Passed" : "Failed");
	}
}