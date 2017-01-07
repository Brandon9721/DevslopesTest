/*
Old example, Updated in fig 3.9

//	Fig 3.2 AccountTest.java
// Creating and manipulating an Account object
//May 11, 2016

import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{		// create a Scanner to obtain input from command window
			Scanner userInput = new Scanner(System.in);
			
			// create an Account object and assign it to myAccount
			Account myAccount = new Account();
			
			// display initial value of name (null)
			System.out.printf("Initial name is: %s%n%n", myAccount.getName());
			
			//prompt for and read name
			System.out.println("Please enter the name:");
			String theName = userInput.nextLine(); // read a line of text
			myAccount.setName(theName); // put theName in myAccount
			System.out.println();

			// display the name stored in object myAccount
			System.out.printf("The name in object myAccount is:%n%s%n%n",
			myAccount.getName());
	}
			
}

*/

// Fig. 3.9: AccountTest.java

import java.util.*;

public class AccountTest
{
	public static void main(String[] args)
	{	
	String userRequest;
	Scanner userInput = new Scanner(System.in);
	
	
		Account account1 = new Account("", 500.00);
		
		// get name for account
		System.out.println("\nPlease enter your name:\n");
		String theName = userInput.nextLine(); 
		account1.setName(theName);  // put theName into account1

	
	System.out.printf("%nThe balance in %s's account is: $%.2f%n%n", 
	account1.getName(), account1.getBalance());
	
	System.out.println("What would you like to do?\n\n");
	System.out.println("******************************");
	System.out.println("*   Deposit   *   Withdraw   *");
	System.out.println("******************************\n");
	
	userRequest = userInput.next();
	
	switch(userRequest)
	{	
		case ("Deposit")  : 	System.out.println("\nHow much do you wish to deposit\n");
		
		double depositAmount = userInput.nextDouble();
		System.out.printf("%nadding $%.2f to %s's account.%n%n", depositAmount, account1.getName());
		account1.deposit(depositAmount); // add to account1's balance
		
		//display balances
		System.out.printf("%nYour new account balance is $%.2f%n%n%n", account1.getBalance());
		
		 break;
		
		
		case ("deposit")  : System.out.println("\nHow much do you wish to deposit\n"); 
		
		depositAmount = userInput.nextDouble();
		System.out.printf("%nadding $%.2f to %s's account.%n%n", depositAmount, account1.getName());
		account1.deposit(depositAmount); // add to account1's balance
		
		//display balances
		System.out.printf("%nYour new account balance is $%.2f%n%n%n", account1.getBalance());
		
		break;
		
		
		case ("Withdraw")  : System.out.println("\nHow much do you wish to withdraw\n"); 
		
		double withdrawAmount = userInput.nextDouble();
		System.out.printf("%nwithdrawing $%.2f from %s's account.%n%n", withdrawAmount, account1.getName());
		account1.withdraw(withdrawAmount); // subtract amount from account
		// display balance
		System.out.printf("%nYour account has $%.2f remaining.%n%n", account1.getBalance());
		
		break;
			
			
		
		case ("withdraw")  : System.out.println("\nHow much do you wish to withdraw\n");
		
			withdrawAmount = userInput.nextDouble();
		System.out.printf("%nwithdrawing $%.2f from %s's account.%n%n", withdrawAmount, account1.getName());
		account1.withdraw(withdrawAmount); // subtract amount from account
		// display balance
		System.out.printf("%nYour account has $%.2f remaining.%n%n", account1.getBalance());
		
		 break;
		 
		 default : System.out.println("\nAn error was detected in your request.");
		 System.out.println("Please ensure that your spelling is correct and try again.\n");
	
	}
	
	
	
	
	
	
	}
}










































