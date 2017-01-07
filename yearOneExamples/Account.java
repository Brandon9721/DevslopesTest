/*

Old account class, updating with later figure


//	Fig 3.1 Account.java
//	Account class that contains a name instance variable
//and methods to set and get its value.

public class Account
{
	private String name;  // instance variable
	
	
	public void setName(String name)	// method header to set the name in the object
	{
		this.name = name; // store the name
	}
	
	public String getName()   // method to retrieve the name from the object
	{
		return name;	// return value of name to caller
	
	}
} // end class account


*/


// fig 3.8: Account.java
// Account class with a double instance variable balance and a constructor 
// and deposit method that perform validation


public class Account
{
	private String name; // instance variable
	private double balance; // instance variable
	
	// Account constructor that receives two parameters
	public Account(String name, double balance)
	{
		this.name = name;	// Assign name to instance variable name
		
		// validate that the balance is greater than 0.0; if it's not,
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0) // if the balance is valid
		this.balance = balance; // assign it to instance variable balance
	}
	
	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) // if the depositAmount is valid
			balance = balance + depositAmount; // add it to the balance
	}
	
	// method that withdraws (subtracts) only a valid amount from the balance
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount < balance) // if the withdrawAmount is valid
		{	if (withdrawAmount < 0)
			{
			balance = balance - (-1 * withdrawAmount);
			}
			else
			balance = balance - withdrawAmount;
		}
	}
	
	
	
	
	// method returns the account balance
	public double getBalance()
	{
		return balance;
	}
	
	// method that sets the name
	public void setName(String name)
	{
		this.name = name;
	}
	
	// method that returns the name
	public String getName()
	{
		return name; // give value of name back to caller
	} // end method getName
} // end class Account


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	