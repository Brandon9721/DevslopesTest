// Reverse array 
// Brandon Byrne (20115464) Sept. 12, 2016

import java.util.*;

class Reverse
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = s.next();
		String reversedWord = reverse(word);
		System.out.println(reversedWord);
	}

	public static String reverse(String s)
	{
		int size = s.length();
		char[] data = new char[size];
		
		for(int i = 0; i < size; i++)
		{
			data[i] = s.charAt(size - 1 - i);
		}
		
		return new String(data);
	}
	
}
		