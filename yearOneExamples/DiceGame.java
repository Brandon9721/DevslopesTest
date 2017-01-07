// simple dice game
// Brandon Byrne (20115464)	May 17,2016

import java.util.Random;
import static java.lang.System.out;

public class DiceGame
{
	public static void main(String[] args)
	{
		Random RandomNumb = new Random();
		int die1 = 0, die2 = 0;
		
		while(die1 + die2 != 7 && die1 + die2 != 11)
		{
			die1 = RandomNumb.nextInt(6) + 1;
			die2 = RandomNumb.nextInt(6) + 1;
			out.print(die1);
			out.print(" and ");
			out.print(die2);
			out.printf(" = %d%n", die1 + die2);
		}
		
		out.print("Rolled ");
		out.println(die1 + die2);
	}
}
		