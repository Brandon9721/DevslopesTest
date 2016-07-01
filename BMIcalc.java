import java.util.Scanner;

public class BMIcalc
{
	public static void main(String[] args)
	{
		
		int Pounds;
		int kilograms;
		float HeightInInches;
		float HeightInMeters;
		String SystemInput;
		float result;
		

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("\nWould you like to use the 'Standard' or 'Metric' system?\n");
		SystemInput = userInput.next();
		
		if (SystemInput.equals("Standard"))
		{
			System.out.println("\nPlease enter your weight in pounds:");
			Pounds = userInput.nextInt();
			
			System.out.println("Please enter your height in inches");
			HeightInInches = userInput.nextInt();
			
			result = ((Pounds * 703) / (HeightInInches * HeightInInches));
			
			
			System.out.printf("%n%nYour Body Mass Index is %f%n%n%n", result);
		}
		
		if (SystemInput.equals("Metric"))
		{
			System.out.println("\nPlease enter your weight in kilograms");
			kilograms = userInput.nextInt();
			
			System.out.println("Please enter your height in meters");
			HeightInMeters = userInput.nextFloat();
			
			result = ((kilograms) / (HeightInMeters * HeightInMeters));
			
			System.out.printf("%n%nYour Body Mass Index is %f%n%n%n", result);
		}
		
	System.out.println("The Department of Health and Human Services / National Institutes");
	System.out.println("provide these BMI values as a general guideline to your personal health.\n\n");
	System.out.println("BMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9");
	System.out.println("Overweight: between 25 and 29.9\nObese: 30 or greater");
	
	
			
			
			
			
			
		}
	}
