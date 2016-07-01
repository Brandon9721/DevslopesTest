// Testing javas Ternary operator  (?:)
// Brandon Byrne (20115464),	June 10, 2016

import java.util.Scanner;

public class ConditionalOperator
{
	public static void main(String[] args)
	{
		int grade;
		Scanner s = new Scanner(System.in);
		String letter;
		
		System.out.print("Enter student grade:   ");
		grade = s.nextInt();
		
		System.out.println(grade >= 60 && grade <=100 ? "\nPassed\n" : "\nFailed\n");
		
		
		System.out.print("Enter a letter:   ");
		letter = s.next();
		
		if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u"))
		System.out.print(letter + " is a vowel\n\n");
	
	}
}