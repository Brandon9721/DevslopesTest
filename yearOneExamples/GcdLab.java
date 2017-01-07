// Lab 4 Greatest common devisor
// Brandon Byrne (20115464)	May 27, 2016

// import scanner
import java.util.Scanner;

//start class
public class GcdLab
{

	// start main method
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);  // create scanner called 's'
		String request;
	
		
		System.out.println("Would you like to solve for the Gcd or Lcm?\n");
		request = s.next();
		
		switch(request)
		{
			case("Gcd") : 
				System.out.print("Enter first number: "); // asks and saves users inputted number
				int numb1 = s.nextInt();
		
				System.out.print("Enter second number: "); // asks and saves users second number
				int numb2 = s.nextInt();
				
				int result = Gcd(numb1, numb2);
				System.out.println("Greatest common devisor: " + result);  
			
				
				break;
				
				
			case("Lcm") : System.out.print("Enter first number: "); // asks and saves users inputted number
				numb1 = s.nextInt();
		
				System.out.print("Enter second number: "); // asks and saves users second number
				 numb2 = s.nextInt();
				
				int answer = Lcm(numb1, numb2);
				System.out.println("Lowest common multiple: " + answer);
		}
	
	
	
	
	
	}
	

public static int Gcd(int numb1, int numb2)
{
	
		int result = numb1 % numb2;  // calculate remainder from dividing both numbers
		
		while(result != 0)  // if there is a remainder then this loop will execute
		{
			numb1 = numb2;  	// numb1 becomes numb2
			numb2 = result;	// and numb2 is given the value of the remainder
			result = numb1 % numb2; 	
			// this calculation gets run again to find out if there is another 
			// remainder or not... If another remainder is found it loops 
			// again. If the remainder comes out as 0 then the loop ends
			// once the loop ends the variable numb2 is the GCD
		}
	result = numb2;
	return result;
	
}



public static int Lcm(int numb1, int numb2)
{
	int GcdValue = Gcd(numb1, numb2);
	int answer = (numb1 * numb2) / GcdValue;
	
	return answer;
}
}


	


















