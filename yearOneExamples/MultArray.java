// MultArray.java
// Brandon Byrne (20115464)	June 1, 2016

public class MultArray
{
	public static void main(String[] args)
	{
		int[][] a = { 
			{1,2},
			{3,4,5,6},
			{7,8,9}
					};
		print(a);
	}
	
	public static void print(int[][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}