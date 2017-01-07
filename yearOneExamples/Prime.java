import java.util.*;

 public class Prime 
 {
 public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter n: ");
int n = s.nextInt();
int count = 0; int i = 1; while(i <= n) 
{
if(n % i == 0) count++;
i++; }
if(count == 2)
System.out.println(n + " is prime.");
else
System.out.println(n + " is not prime");
 }
 }