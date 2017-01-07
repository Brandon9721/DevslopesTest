// CP1270	Lab 51	Arrays
// Brandon Byrne (20115464)	June 1, 2016

import java.util.*;

public class Lab51
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		String grabWord;
	
		
		System.out.print("\n\nEnter a word:	");  // prompt user for a word
		
		grabWord = userInput.next();	// stores inputted value as a string
		
		char[] word = new char[grabWord.length()];  // array was created and has a length as long as users inputted word
	
	
		for (int i = 0; i < grabWord.length(); i++)   // loop to designate each individual letter to a slot in an array
		{
			word[i] = grabWord.charAt(i);
		//	System.out.print(word[i] + " ");  // check that each letter was stored properly
		} // end loop
		
		
		System.out.printf("Your word, %s, has %d vowels%n%n%n", grabWord, countVowels(word, grabWord)); 
		// calls countVowels function in order to print number of vowels in users word
		
	} // end main method
	
	
	
	
	public static int countVowels(char word[], String grabWord)  // start function countVowels that was called from above
	{
		int vowels = 0;
		
		for(int i = 0; i < grabWord.length(); i++)  
		{
			if(word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u' || word[i] == 'y'
			|| word[i] == 'A' || word[i] == 'E' || word[i] == 'I' || word[i] == 'O' || word[i] == 'U' || word[i] == 'Y')
			{
				vowels++;  // this loops through each value in array and if it is a vowel ('a,e,i,o,u, or y) then it 
						   // increments the vowels variable 
			}
		}
		
		return vowels;   // return value of vowels to be printed out above
	
	}	// end countVowels function
	
	
	
	
} // end public class 