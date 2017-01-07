// InsertionSort.java
// Brandon Byrne (20115464)	May 31, 2016

public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] n = new int[10];
		generateNumbers(n);
		print(n);
		sort(n);
		print(n);
	}
	
	
	
	public static void generateNumbers(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			n[i] = (int)(Math.random() * 100);
		}
	}
	
	
	public static void print(int[] n)
	{
		for(int i = 0; i< n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println();
	}
	
	
	public static void sort(int[] n) 
	{
		for(int i = 1; i< n.length; i++)
		{
			int pivot = n[i];
			for(int j = i - 1; j >= 0; j--)
			{
				if(pivot < n[j])
				{
					int temp = n[j + 1];
					n[j + 1] = n[j];
					n[j] = temp;
				
				}
				
				
				
			}
		}
	}
}

	
	