// Branddon Byrne (20115464)
import java.util.UUID;
import java.util.Scanner;


class Employee
{
	protected double salary;
	protected String name;
	protected String id;
	
	public Employee()
	{
		salary = 0.00;
		name = "";
		id = "NULL";
	}
	
	public Employee(double salary, String name, String id)
	{
		this.salary = salary;
		this.name = name;
		this.id = id;
	}
	
	
	public String toString()
	{
		String s = "\nEmployee name: " + name + "\nSalary: $" + salary +
		" \nEmployee ID: " + name.toUpperCase() + "---" + id + "\n";
		return s;
	}
}


class Salesperson extends Employee
{
	
	private Policy p;
	
	public Salesperson(double salary, String name, String id, Policy p)
	{
		super(salary, name, id);
		
		this.p = p;
	}
	
	public String toString()
	{
		String s = "Salesperson Employee: " + name + "\nSalary: " + salary +  "\nEmployee ID: " + name.toUpperCase() + "---" +
			id + "\n\n" + name + " has sold an insurance policy to " + p.getBeneficiary() + "\n\nPolicy info:\n\nBeneficiary Name: " + p.getBeneficiary() + "\nInsurable amount: " + p.getAmount() + "\nPurchaser ID: " + p.getpid() + "\n\n";
		
		// really long toString, prints out entire salesperson and policy info at end of program runtime.
		return s;
	}
}

//Policy class that gets insurance policy info that will later be called into Salesperson class
class Policy
{
	private String beneficiary;
	private double amount;
	private String pid;
	
	public Policy(String beneficiary, double amount, String pid)
	{
		this.beneficiary = beneficiary;
		this.amount = amount;
		this.pid = pid;
	}

	public String getBeneficiary()
	{
		return beneficiary;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public String getpid()
	{
		return pid;
	}
}





class Lab41
{
	public static void main(String[] args)
	{
		String uuidID = UUID.randomUUID().toString();
		String uuidPID = UUID.randomUUID().toString();
		// creates random alphanumeric values for an id
		
		Scanner scan = new Scanner(System.in);
		
		
		// program will ask for user input to create a salesperson and a insurance buyer / beneficiary
		System.out.print("\nCreate a salesperson:\n\nEmployee name: ");
		String name = scan.nextLine();
		
		
		System.out.print("Employee salary: ");
		double salary = scan.nextDouble();
		scan.nextLine();
		
		
		System.out.println("Alright, " + name + "'s employee id is:\n " + name.toUpperCase() + "---" + uuidID);
						   
						   
		System.out.println("\n\nA customer is looking to buy some insurance from you.\nWhat is the customers name?	");
		String beneficiary = scan.nextLine();
		
		
		System.out.print("\nTell the customer that the policy you offer will\ncover damage costs of up to: ");
		double amount = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("\n\n----------------------------------------------------------\n\nOkay " + beneficiary + " took your offer.\nHere is the receipt for the purchased insurance regarding your salesperson and\nthe policy you are selling to them:\n");
		
		
		//creates policy with info user enters
		Policy p = new Policy(beneficiary, amount, beneficiary.toUpperCase() + "---" + uuidPID);
		
		//creates salesperson with info given and policy made above
		Salesperson x = new Salesperson(salary, name, uuidID, p);
		
		
		// prints out all info
		System.out.println("\n" + x);
		
		
	}
}









// testing methods to make sure they work properly


//class testEmployee
//{
//	public static void main(String[] args)
//	{
//		Employee A = new Employee();
//		System.out.println("\nEMPTY VALUES FOR EMPLOYEE: \n" + A);
//		
//		Employee B = new Employee(80000.00, "John", "JOHN.Employee001"); // employee salary, name and employee id
//		System.out.println(B);
//		
//		
////		(OLD not working now)	Salesperson C = new Salesperson(77000.00, "Betty", 2);
////		System.out.println(C);
//
//		Policy x = new Policy("Freddy Smith", 100000, "INSURANCE.BUYER001"); // policy info of buyer name,																							 // insurable amount, and buyer id.
//		System.out.println("\nPOLICY INFO:\n\nBeneficiary: " + x.getBeneficiary());
//		System.out.println("Can claim insurance for damages up to: " + x.getAmount());
//		System.out.println("Purchaser ID: " + x.getpid());
//		System.out.println("\n");
//		
//		
//		
//		Salesperson D = new Salesperson(67500.50, "Troy", "TROY.Employee002", x); // gives salary, name, id, and the policy info he																			//is selling
//		System.out.println(D);
//		
//		
//		
//	}
//}