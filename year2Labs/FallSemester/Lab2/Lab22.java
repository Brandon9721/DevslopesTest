import java.lang.*;
import java.util.*;

class MyInteger
{
	private int number;
	
	public MyInteger()
	{
		number = 0;
	}
		
	public MyInteger(int number)
	{
		this.number = number;
	}
	
	public String toString()
	{
		String s = "The number " + number;
		return s;
	}
	
	public boolean isEven()
	{
		if(number % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd()
	{
		if(!isEven())
			return true;
		else 
			return false;
	}
	
	public boolean isPrime()
	{
		if(number > 2 && number % 2 == 0) // check if multiple of 2 (NOTE 2 is prime so 
		{						    // only check multiples above 2	
				return false;
		}
		for(int i = 3; i * i <= number; i += 2)
		{
			if(number % i == 0) // if it is a multiple of current loop index
			{				// then it is not prime, so return false
				return false;
			}
		}
		return true;
	}
	
	public boolean isPerfect()
	{
		boolean perfect = false;
		int sum = 1;
		
		if(number < 6)
			return false;
			
		for(int i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
			{
				sum += i;
			}
		}
		if(number == sum)
		{
			perfect = true;
		}
		return perfect;
	}
	
	public boolean isPerfectSquare()
	{	
		boolean result = false;
		int squareRoot = (int) Math.sqrt(number);
		if((squareRoot * squareRoot) == number)
			result = true;
		
		return result;
	}
	
	public void primeFactors()
	{
		for(int i = 2; i <= number; i++)
		{
			if(number % i == 0)
			{
				number = number / i;
				System.out.print("\n" + i);
				i--;
			}
        }
	}
}

class Lab22
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int usernum = 0;
		
		System.out.println("\nThis program will determine some characteristics of user inputted integers.");
		System.out.println("Test numbers one by one or all at once.\nTo test multiple numbers, space integers out.\n(EXAMPLE: 5 10 123 496 683 8128 12100");
        System.out.println("To end the program, enter: 1\n");
		
		//MyInteger number = new MyInteger(usernum);
		
		while(true)
		{
			try
			{
				System.out.print("Enter an integer: ");
				usernum = s.nextInt();
				System.out.println();
				
			}
			catch(InputMismatchException exception)
			{
				System.out.println("This is not an integer!\n");
				s.nextLine();
			}
			MyInteger number = new MyInteger(usernum);
			
			if(usernum == 1)
			{
				break;
			}
			else if(usernum < 0)
			{
				System.out.println(number + " is negative! Please enter a positive integer.\n");
			}
			else
			{
				if(number.isEven())
				{
					System.out.println(number + " is even\n");
				}
				if(number.isOdd())
				{
					System.out.println(number + " is odd\n");
				}	
				if(number.isPrime())
				{
					System.out.println(number + " is a prime number\n");
				}
				if(number.isPerfect())
				{
					System.out.println(number + " is a perfect number\n");
				}
				if(number.isPerfectSquare())
				{
					System.out.println(number + " is a perfect square number\n");
				}
				
				System.out.print("\nPrime factors of " + usernum + " are: ");
				number.primeFactors();
				System.out.println("\n\n(Remember: Enter '1' to end loop)");
                System.out.println("----------------------------------------------------------------------");
            }
			System.out.println("\n\n");
		}
	}
}










class TestMyInteger
{
	public static void main(String[] args)
	{
		MyInteger a = new MyInteger();
		MyInteger b = new MyInteger(8128);
		MyInteger c = new MyInteger(12100);
        MyInteger d = new MyInteger(101);
		if(b.isEven())
		{
			System.out.println(b + " is even\n");
		}
		else
		{
			System.out.println(b + " is odd\n");
		}
		if(d.isOdd())
		{
			System.out.println(d + " is odd\n");
		}
		else
		{
			System.out.println(d + " is even\n");
		}
		
		if(b.isPrime())
		{
			System.out.println(b + " is prime\n");
		}
		
		if(b.isPerfect())
		{
			System.out.println(b + " is perfect\n");
		}
		
		if(c.isPerfectSquare())
		{
			System.out.println(c + " is a perfect square\n");
		}
		
		System.out.print("Prime factors of " + c + " are: ");
		c.primeFactors();
		System.out.println("\n");
		
	}
}

