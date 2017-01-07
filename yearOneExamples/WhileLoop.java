//	While loops
//	Brandon Byrne (20115464)	May 17, 2016
import java.util.*;

public class WhileLoop
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while (i <= n) 
		{
			System.out.print(i + "  ");
			i++;
		}
		System.out.println();
	}
}