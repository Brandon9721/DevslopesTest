// String Constructors
// Brandon Byrne (20115464)	June 1, 2016

public class StringConstructors
{
	public static void main(String[] args)
	{
		String s1 = new String(); // empty string
		String s2 = new String("Some words");	// characters stored into a string
		char[] ca = {'a','b','c'};
		String s3 = new String(ca); //Stores array 'ca' as a string
		String s4 = new String(ca, 1, 2);  // stores array 'ca's values from slots 1 & 2
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
