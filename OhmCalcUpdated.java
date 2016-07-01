//	CP1270 Programming Fundamentals Assignment #1
// 	Brandon Byrne (20115464)	May 16, 2016 (Original date)
//	Updated on May 27, 2016


//	import Scanner
import java.util.Scanner;	
import javax.swing.JOptionPane;



//	create class
public class OhmCalcUpdated
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
		
		
		//Display dialog box to welcome user
		JOptionPane.showMessageDialog(null, "Welcome to my Ohm Calculator");
		
		
		while(i <= 10)  // loops until 'i' = 10 or more.. 'i' increments each loop so it will loop 10 times
		{
		
		
		//	ask what the user is solving for
		request = JOptionPane.showInputDialog("What are you solving for? 'Voltage', 'Current', or 'Resistance'?");
		
		
		
		
		
		/*	use either 'if' statements or 'switch and cases' to determine what the user wants to solve and 
			run corresponding code to calculate the answer */
		switch(request)
			{
			/* if user types 'Voltage' or 'voltage' it will ask for current and resistance values 
				and calculate voltage */
			case ("Voltage") : 	current = Float.parseFloat(JOptionPane.showInputDialog("What is the current in amps?"));
							
			resistance = Float.parseFloat(JOptionPane.showInputDialog("What is the resistance in ohms?"));
			
			voltage = current * resistance;
			
			JOptionPane.showMessageDialog(null, "The voltage is: " + voltage + " Volts"); i++; break;
			
			
			case ("voltage") : current = Float.parseFloat(JOptionPane.showInputDialog("What is the current in amps?"));
							
			resistance = Float.parseFloat(JOptionPane.showInputDialog("What is the resistance in ohms?"));
			
			voltage = current * resistance;
			
			JOptionPane.showMessageDialog(null, "The voltage is: " + voltage + " Volts"); i++; break;
			
			
			
			
			
			
			
			
			/*	if user type 'Current' or 'current' it will ask for voltage and resistance values 
				and calc. current */
			case ("Current") : voltage = Float.parseFloat(JOptionPane.showInputDialog("What is the voltage in volts?"));
							
			resistance = Float.parseFloat(JOptionPane.showInputDialog("What is the resistance in ohms?"));
			
			current = voltage / resistance;
			
			JOptionPane.showMessageDialog(null, "The current is: " + current + " Amps"); i++; break;
			
			
			
			
			case ("current") : voltage = Float.parseFloat(JOptionPane.showInputDialog("What is the voltage in volts?"));
							
			resistance = Float.parseFloat(JOptionPane.showInputDialog("What is the resistance in ohms?"));
			
			current = voltage / resistance;
			
			JOptionPane.showMessageDialog(null, "The current is: " + current + " Amps"); i++; break;
			
			
			
			
	
	
	
	
	
	
	
	
			/*	if user types 'Resistance' or 'resistance' it will ask for voltage and current then calc. for 
				resistance */
			case ("Resistance") : voltage = Float.parseFloat(JOptionPane.showInputDialog("What is the voltage in volts?"));
							
			current = Float.parseFloat(JOptionPane.showInputDialog("What is the current in amps?"));
			
			resistance = voltage / current;
			
			JOptionPane.showMessageDialog(null, "The resistance is: " + resistance + " Ohms"); i++; break;
			
			
			
			
			case ("resistance") : voltage = Float.parseFloat(JOptionPane.showInputDialog("What is the voltage in volts?"));
							
			current = Float.parseFloat(JOptionPane.showInputDialog("What is the current in amps?"));
			
			resistance = voltage / current;
			
			JOptionPane.showMessageDialog(null, "The resistance is: " + resistance + " Ohms"); i++; break;
			
			
			
			
			
			
			
			
			
			// default will catch errors in user input if the user misspells a word
			default : JOptionPane.showMessageDialog(null, "There was an error in your request.\nPlease ensure you use the correct spelling");
			 break;
			
			} // end switch
			 
		
		} // end while loop
		
		JOptionPane.showMessageDialog(null, "End of Loop! Click 'OK' to end program");
	} // end main method
} // end class
		