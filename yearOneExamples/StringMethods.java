// String Methods
// Brandon Byrne (20115464)	june 1, 2016

public class StringMethods
{
	public static void main(String[] args)
	{
		
		
		String s1 = new String("abcde");
		
		
		
		int length = s1.length();
		System.out.println(s1 + " has " + length + " characters ");
		
		
		
		char c1 = s1.charAt(1);
		System.out.println("Second character is: " + c1);
		
		
		
		int position = s1.indexOf('e');
		System.out.println("The index of the letter 'e' is: " + position);
		
		
		
		
		char[] characters = s1.toCharArray();
		for(int i = 0; i < characters.length; i++)
		{
			System.out.println(characters[i]);
		}
		
		
		
		
		
		
		String p = new String("XYZ");
		System.out.println(s1 + " " + p);
		
	
	
		if(s1.equals(p))
			System.out.println("Data is the same");
		else
		System.out.println("Data is different");
		
		
		
		if(s1 == p)
			System.out.println("Same references");
		else
			System.out.println("Different references");
			
		
		
		String subs = s1.substring(3);
		System.out.println("Substring: " + subs);
		
		String ccs = s1.concat(p);
		System.out.println("s concat p: " + ccs);
		
		String lowCase = p.toLowerCase();
		System.out.println("Lowercase: " + lowCase);
		
		String upCase = s1.toUpperCase();
		System.out.println("Uppercase: " + upCase);
		
		

	}
}