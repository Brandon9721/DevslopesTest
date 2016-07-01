// Find minimum
// Brandon Byrne (20115464)	May 24, 2016

public class FindMin
{
	public static void main(String[] args)
	{
		int[] n = new int[100];
		for (int i = 0; i < n.length; i++)
		{
			n[i] = (int)(Math.random() * 100);
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
		int min = n[0]; int loc = 0;
		for (int i = 1; i < n.length; i++)
		{
			if (n[i] < min)
			{
				min = n[i]; loc = i;
			}
		}
		
		System.out.println(min + " at: " + loc);
	}
}
