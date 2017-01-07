/* method signature examples
Defined as
[public|private|protected][static][return-type] name([type] arg1, [type] arg2, ...) 
	{
	// body
	 }

Examples:
public static void main(String[] args)
 public static boolean isPrime(int n) 
 public static int gcd(int m, int n)
 */
 
 public class Area
 {
 	public static void main(String[] args)
 	{
 		int w = 2; int h = 3;
 		int a = area(w, h);
 		System.out.println("Area: " + a);
 	}
 	public static int area(int w, int h)
 	{
 		int ar = w * h;
 		return ar;
 	}
 }