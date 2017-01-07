import java.util.Scanner;

abstract class Account
{
    protected double amount;
    
    public Account() // new accounts start at $0
    {
        this.amount = 0.00;
    }
    
    void deposit(double m) // method to deposit money into account
    {
        this.amount += m;
    }
    
    
    void withdraw(double m) // method to withdraw money if there are sufficient funds
    {
        if(this.amount >= m)
        {
            amount -= m;
        }
        else
        {
            System.out.println("\nInsufficient funds to withdraw that amount. Amount stays the same");
        }
    }
    
    abstract public void show();
    abstract public double dailyInterest();
    // abstract method calls for polymorphism to work
}



class Saving extends Account
{
    public Saving()
    {
        super(); // calls constructor in Account class
    }
    
    public double dailyInterest() // method calculates interest for savings account
    {
        this.amount *= 1.06;
        return amount;
    }
    
    public void show() // shows amount in savings account
    {
        System.out.printf("$%.2f%n", amount);
    }
}


class Chequing extends Account
{
    public Chequing()
    {
        super(); // calls constructor in Account class
    }
    
    public double dailyInterest() //method for chequings interest
    {
        if(amount >= 1000)
        {
            double newAmount = this.amount - 1000;
            newAmount *= 0.03;
            this.amount += newAmount;
            return amount;
        }
        else
        {
            System.out.println("Not enough in account for interest");
            return amount;
        }
    }
    
    public void show() // method shows amount in account
    {
        System.out.printf("$%.2f%n", amount);
    }
}


class Lab42
{
    public static void main(String[] args)
    {
        Account[] A = new Account[2]; // create array of accounts, 2 elements, one for chequing and one for savings
        Scanner s = new Scanner(System.in);
        
        
        Saving savings = new Saving();
        Chequing Chequing = new Chequing();
        
        A[0] = savings;
        A[1] = Chequing;
       
        System.out.print("\nThe new Savings acc has ");
        A[0].show();
        
        System.out.print("\nThe new Chequings acc has ");
        A[1].show();
        
        // deposit money into both accounts
        System.out.println("\nTo start off, deposit money into the accounts (Numbers only please)");
        System.out.print("Enter amount to deposit into Savings: ");
        A[0].deposit(s.nextDouble());
        
        System.out.print("\nSavings acc has ");
        A[0].show();
        System.out.println();
        
        
        System.out.print("Enter amount to deposit into Chequing: ");
        A[1].deposit(s.nextDouble());
        
        System.out.print("\nChequings acc has ");
        A[1].show();
        System.out.println();
        
        
        
        // withdraw some money from both accounts, just so all methods are used.
        System.out.println("Now withdraw some money from each account.\n");
        System.out.print("Enter amount to withdraw from Savings: ");
        A[0].withdraw(s.nextDouble());
        
        System.out.print("\nSavings acc has ");
        A[0].show();
       
        
        System.out.print("\nEnter amount to withdraw from Chequings: ");
        A[1].withdraw(s.nextDouble());
        System.out.print("\nChequings acc has ");
        A[1].show();

        // shows daily interest of both accounts
        System.out.println("\n\nAfter daily interest, both accounts have:\n");
        System.out.println("Savings after 6%: ");
        A[0].dailyInterest();
        A[0].show();

        
        System.out.println("\nChequings after 3% increase of balance above $1000: ");
        A[1].dailyInterest();
        A[1].show();

        
    }
}



class TestLab42
{
    public static void main(String[] args)
    {
        Account[] test = new Account[2];
        
        Saving savingAcc = new Saving();
        Chequing ChequingAcc = new Chequing();
        
        test[0] = savingAcc;
        test[1] = ChequingAcc;
        System.out.print("\nSavings acc has ");
        test[0].show();
        
        System.out.print("\nChequings acc has ");
        test[1].show();
        
        
        System.out.println("\nSavings deposit");
        test[0].deposit(12345);
        
        System.out.print("Savings acc has ");
        test[0].show();
        
        System.out.print("\nSavings acc withdraw 345 \n");
        test[0].withdraw(345);
        test[0].show();
        
        System.out.print("\nSavings account after 6% interest\n");
        test[0].dailyInterest();
        test[0].show();
        
        
        
        System.out.println("\nChequing deposit");
        test[1].deposit(2500);
        
        System.out.print("Chequing acc has ");
        test[1].show();
        
        System.out.print("\nChequing acc withdraw 345 \n");
        test[1].withdraw(750);
        test[1].show();
        
        System.out.print("\nChequing account after 3% interest of balance amount over $1000\n");
        
        
        
        test[1].dailyInterest();
        test[1].show();
        
    
    }
}
