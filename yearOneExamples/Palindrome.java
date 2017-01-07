// Palindrome.java
// Brandon Byrne (20115464)	June 3, 2016

import java.util.*;

public class Palindrome
{
	public static void main(String[] args)
	{	
		System.out.print("Enter word: ");
		Scanner s = new Scanner(System.in);
		String word = s.next();
		
		if(isPalindrome(word))
		System.out.println(word + " is a palindrome");
		
		else
		System.out.println(word + " is not a palindrome");
	}
	
	public static boolean isPalindrome(String word)
	{
		String rword = reverse(word);
		if(rword.equals(word))
		return true;
		
		else
		return false;
	}
	
	public static String reverse(String word)
	{
		int length = word.length();
		char[] ca = new char[length];
		for(int i = 0; i < length; i++)
		{
			ca[i] = word.charAt(length - i - 1);
		}
		return new String(ca);
	}
}