//	CP1270 Programming Fundamentals Assignment #1
// 	Brandon Byrne (20115464)	May 16, 2016

//	import Scanner
import java.util.Scanner;	
import javax.swing.JOptionPane;



//	create class
public class OhmCalc
{
	//	start main method
	public static void main(String[] args)
	{
		
		//	declare variable names
		float voltage;
		float current;
		float resistance;
		Scanner userInput = new Scanner(System.in);
		String request;
		int i = 1;
		
		
		
		//JOptionPane.showMessageDialog(null, "Welcome to my Ohm Calculator");
		
		
		while(i <= 10)  // loops until 'i' = 10 or more.. 'i' increments each loop so it will loop 10 times
		{
		
		
		//	ask what the user is solving for
		System.out.println("\n\n\nAre you solving for 'Voltage', 'Current', or 'Resistance'?\n");
		request = userInput.next();
		
		
		//request = JOptionPane.showInputDialog("What are you solving for? 'Voltage', 'Current', or 'Resistance'?");
		
		
		
		
		
		/*	use either 'if' statements or 'switch and cases' to determine what the user wants to solve and 
			run corresponding code to calculate the answer */
		switch(request)
			{
			/* if user types 'Voltage' or 'voltage' it will ask for current and resistance values 
				and calculate voltage */
			case ("Voltage") : System.out.print("\n\nWhat is the current in amps:    ");
			current = userInput.nextFloat();
			System.out.print("\n\nWhat is the resistance in ohms:    ");
			resistance = userInput.nextFloat();
			
			voltage = current * resistance;
			
			System.out.printf("%n%nThe voltage is:   %.3f Volts%n%n", voltage); i++; break;
			
			
			case ("voltage") : System.out.print("\n\nWhat is the current in amps:    ");
			current = userInput.nextFloat();
			System.out.print("\n\nWhat is the resistance in ohms:    ");
			resistance = userInput.nextFloat();
			
			voltage = current * resistance;
			
			System.out.printf("%n%nThe voltage is:   %.3f Volts%n%n", voltage); i++; break;
			
			
			
			
			
			
			
			
			/*	if user type 'Current' or 'current' it will ask for voltage and resistance values 
				and calc. current */
			case ("Current") : System.out.print("\n\nWhat is the voltage in volts:    ");
			voltage = userInput.nextFloat();
			System.out.print("\n\nWhat is the resistance in ohms:    ");
			resistance = userInput.nextFloat();
			
			current = voltage / resistance;
			
			System.out.printf("%n%nThe current is:   %.3f Amps%n%n", current); i++; break;
			
			
			
			case ("current") : System.out.print("\n\nWhat is the voltage in volts:    ");
			voltage = userInput.nextFloat();
			System.out.print("\n\nWhat is the resistance in ohms:    ");
			resistance = userInput.nextFloat();
			
			current = voltage / resistance;
			
			System.out.printf("%n%nThe current is:   %.3f Amps%n%n", current); i++; break;
			
			
			
	
	
	
	
	
	
	
	
			/*	if user types 'Resistance' or 'resistance' it will ask for voltage and current then calc. for 
				resistance */
			case ("Resistance") : System.out.print("\n\nWhat is the voltage in volts:    ");
			voltage = userInput.nextFloat();
			System.out.print("\n\nWhat is the current in amps:    ");
			current = userInput.nextFloat();
			
			resistance = voltage / current;
			
			System.out.printf("%n%nThe current is:   %.3f Ohm's%n%n",  resistance); i++; break;
			
			
			
			case ("resistance") : System.out.print("\n\nWhat is the voltage in volts:    ");
			voltage = userInput.nextFloat();
			System.out.print("\n\nWhat is the current in amps:    ");
			current = userInput.nextFloat();
			
			resistance = voltage / current;
			
			System.out.printf("%n%nThe resistance is:   %.3f Ohm's%n%n", resistance); i++; break;
			
			
			
			
			
			
			
			
			
			// default will catch errors in user input if the user misspells a word
			default : System.out.println("\n\nThere was an error in your request,");
			 System.out.println("make sure that proper spelling is being used and try again.\n");
			 break;
			
			} // end switch
			 
		
		} // end while loop
		
	} // end main method
} // end class
		