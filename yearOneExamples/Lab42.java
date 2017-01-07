// Lab 4 Greatest common devisor
// Brandon Byrne (20115464)	May 27, 2016

// import scanner
import java.util.Scanner;

//start class
public class Lab42
{

	// start main method
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);  // create scanner called 's'
		String request; // string to be used in the switch a few lines below
		
		
		System.out.println("Would you like to solve for the Gcd or Lcm?\n(This will loop 3 times)\n"); // determine if the user wishes to solve for GCD or LCM
		request = s.next();
		
		int i = 0;
		while(i < 3)
		{
			switch(request)
			{
				// depending on what you type, either the Gcd or Lcm function will run
				// the cases for gcd and lcm are repeated 3 times to account for lower and capital lettering
				case("Gcd") : 
				System.out.print("\nEnter first number: "); // asks and saves users inputted number
				int numb1 = s.nextInt();
		
				System.out.print("Enter second number: "); // asks and saves users second number
				int numb2 = s.nextInt();
				
				
				System.out.println("\nGreatest common devisor: " + Gcd(numb1, numb2));   // calls the Gcd function using 
				i++;																		 // the users inputted numbers
				break;
				
				case("GCD") : 
				System.out.print("\nEnter first number: ");
				numb1 = s.nextInt();
		
				System.out.print("Enter second number: "); 
				numb2 = s.nextInt();
				
				
				System.out.println("\nGreatest common devisor: " + Gcd(numb1, numb2));  
				i++;
				break;
				
				
				case("gcd") : 
				System.out.print("\nEnter first number: "); 
				numb1 = s.nextInt();
		
				System.out.print("Enter second number: "); 
				numb2 = s.nextInt();
				
				
				System.out.println("\nGreatest common devisor: " + Gcd(numb1, numb2));  
				i++;
				break;
				
				
				
				
				case("Lcm") : System.out.print("\nEnter first number: "); // asks and saves users inputted number
				numb1 = s.nextInt();
		
				System.out.print("Enter second number: "); // asks and saves users second number
				 numb2 = s.nextInt();
				
				System.out.println("\nLowest common multiple: " + Lcm(numb1, numb2)); // calls Lcm function
				i++;																	  // using the users inputted numbers
				break;
				
				
				case("LCM") : System.out.print("\nEnter first number: "); 
				numb1 = s.nextInt();
		
				System.out.print("Enter second number: "); 
				 numb2 = s.nextInt();
				
				System.out.println("\nLowest common multiple: " + Lcm(numb1, numb2));
				i++;
				break;
				
				
				case("lcm") : System.out.print("\nEnter first number: ");
				numb1 = s.nextInt();
		
				System.out.print("Enter second number: "); 
				 numb2 = s.nextInt();
				
				System.out.println("\nLowest common multiple: " + Lcm(numb1, numb2));
				i++;
				break;	
				
				
				default : System.out.println("\nPlease ensure you use correct spelling of 'GCD' or 'LCM'");
			} // end switch
		} // end while loop
	} // end main method
	
	
	
	
	
	
	
	
	
	
	// Greatest common divisor function
	public static int Gcd(int numb1, int numb2)
	{
		if(numb2 == 0) // recursion stops once numb2 is 0
		{
			return numb1;	
		}
		
		else return Gcd(numb2, numb1 % numb2);  // recalls itself if remainder is greater than 0
												// and switches numb1 with numb2 while giving numb2
												// the value of numb1%numb2
	} // end Gcd function


	// Lowest common multiple function
	public static int Lcm(int numb1, int numb2)
	{
		int GcdValue = Gcd(numb1, numb2); // variable GcdValue calls Gcd function and stores the result
										  // of that function
		int answer = (numb1 * numb2) / GcdValue; // variable answer stores the LCM 
	
		return answer; // Function Lcm returns the value of answer to be used in the switch above
	} // end Lcm function 


} // end public class Lab42.java

