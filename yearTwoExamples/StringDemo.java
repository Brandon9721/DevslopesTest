// cp1340  Brandon Byrne 20115464
// Sept. 9, 2016
// String Demo

class StringDemo
{
	public static void main(String[] args)
	{
	String s1 = new String("abc");
	String s2 = new String("abcd");
	
	System.out.println("s1 reference: " + System.identityHashCode(s1));
	System.out.println(s1);
	
	System.out.println("s2 reference: " + System.identityHashCode(s2));
	System.out.println(s2);
	
	if(s1 == s2)
		System.out.println("Same object");
	else
		System.out.println("Different reference");
		
	if(s1.equals(s2))
		System.out.println("Same strings");
	else
		System.out.println("Different strings");
		
		
	String s3 = s1;
	System.out.println("s3 reference: " + System.identityHashCode(s3));
        System.out.println(s3);
	
	}
}

	
