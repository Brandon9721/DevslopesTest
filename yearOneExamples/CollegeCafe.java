//	CP1270 worksheet
//	CNA Cafe 
//Brandon Byrne (20115464)	May 12, 2016


// MESSY CODE  NOT FIXING BUT IT WORKS.
// WANTED TO HAVE MORE OPTIONS BUT DONT KNOW PROPER METHODS YET FOR WHAT I WANT TO DO

import java.util.*;

public class CollegeCafe
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
	double totalPrice = 0;
	
	String req;
	
	
	
	System.out.println("\n\nWelcome to CNA Cafe, What would you like to order:\n\n");
	System.out.println("\t****************************");
	System.out.println("\t*         CNA CAFE         *");
	System.out.println("\t****************************");
	System.out.println("\t* 1) Coffee         $1.00  *");
	System.out.println("\t* 2) Tea            $1.50  *");
	System.out.println("\t* 3) Cappuccino     $2.00  *");
	System.out.println("\t* 4) Moka           $2.50  *");
	System.out.println("\t* 5) Hot-Chocolate  $3.00  *");
	System.out.println("\t* 6) Latte          $3.50  *");
	System.out.println("\t****************************\n\n");
	
	req = userInput.next();
	
	
	if (req.equals("Coffee") || req.equals("coffee") || req.equals("Tea") || req.equals("tea") || 
	req.equals("Cappuccino") || req.equals("cappuccino") || req.equals("Moka") || req.equals("moka") || 
	req.equals("Hot-Chocolate") || req.equals("hot-chocolate") || req.equals("Latte") || req.equals("latte")  )
	{	
		System.out.printf("%nYou added %s to your order.%n%n", req);
		if (req.equals("Coffee") || req.equals("coffee"))
		{
			totalPrice += 1.00;
		}
		if (req.equals("Tea") || req.equals("tea"))
		{
			totalPrice += 1.50;
		}
		if (req.equals("Cappuccino") || req.equals("cappuccino"))
		{
			totalPrice += 2.00;
		}
		if (req.equals("Moka") || req.equals("moka"))
		{
			totalPrice += 2.50;
		}
		if (req.equals("Hot-Chocolate") || req.equals("hot-chocolate"))
		{
			totalPrice += 3.00;
		}
		if (req.equals("Latte") || req.equals("latte"))
		{
			totalPrice += 3.50;
		}
		
		
		System.out.println("Would you like to add another item to your order (Y/N)\n");
		
		req = userInput.next();
	
			if (req.equals("Y") || req.equals("y") || req.equals("yes") || req.equals("Yes") )
			{
				System.out.println("\n\nWhat else do you wish to add: \n\n");
					
					System.out.println("\t****************************");
	System.out.println("\t*         CNA CAFE         *");
	System.out.println("\t****************************");
	System.out.println("\t* 1) Coffee         $1.00  *");
	System.out.println("\t* 2) Tea            $1.50  *");
	System.out.println("\t* 3) Cappuccino     $2.00  *");
	System.out.println("\t* 4) Moka           $2.50  *");
	System.out.println("\t* 5) Hot Chocolate  $3.00  *");
	System.out.println("\t* 6) Latte          $3.50  *");
	System.out.println("\t****************************\n\n");
	
	req = userInput.next();
	
	
	
	if (req.equals("Coffee") || req.equals("coffee") || req.equals("Tea") || req.equals("tea") || 
	req.equals("Cappuccino") || req.equals("cappuccino") || req.equals("Moka") || req.equals("moka") || 
	req.equals("Hot-Chocolate") || req.equals("hot-chocolate") || req.equals("Latte") || req.equals("latte")  )
	{	
		
		if (req.equals("Coffee") || req.equals("coffee"))
		{
			totalPrice += 1.00;
		}
		if (req.equals("Tea") || req.equals("tea"))
		{
			totalPrice += 1.50;
		}
		if (req.equals("Cappuccino") || req.equals("cappuccino"))
		{
			totalPrice += 2.00;
		}
		if (req.equals("Moka") || req.equals("moka"))
		{
			totalPrice += 2.50;
		}
		if (req.equals("Hot-Chocolate") || req.equals("hot-chocolate"))
		{
			totalPrice += 3.00;
		}
		if (req.equals("Latte") || req.equals("latte"))
		{
			totalPrice += 3.50;
		}
		System.out.printf("%nYou added %s to your order.%n%nThe final price is %f%n%n", req, totalPrice);
		
	}
			}
			
			if (req.equals("N") || req.equals("n") || req.equals("no") || req.equals("No") )
			{
				System.out.printf("%nThe total price of your order is: %f%n%n", totalPrice); 
			}
			
			
			
		}
		}
		}
		
	
	
	
	
	
	
	