// Reverse.java
//Brandon Byrne (20115464)	June 3, 2016

import java.util.*;

public class Reverse
{
	public static void main(String[] args)
	{
		System.out.print("Enter word: ");
		Scanner s = new Scanner(System.in);
		String word = s.next();
		
		String reversedWord = reverse(word);
		System.out.println(reversedWord);
	}
	
	public static String reverse(String word)
	{
		int length = word.length();
		char[] ca = new char[length];
		for(int i = 0; i< length; i++)
		{
			ca[i] = word.charAt(length - i - 1);
		}
		return new String(ca);
	}
}