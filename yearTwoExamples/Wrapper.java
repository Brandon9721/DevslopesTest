class Wrapper
{
	public static void main(String[] args)
	{
		int x = 10;
		String sx = String.valueOf(x);
		System.out.println(sx + " is X in roman");
		
		String sy = "1234";
		int y = Integer.parseInt(sy);
		y++;
		System.out.println("successor of " + sy + " is " + y);
		
		if(isNumber(sy))
		{
			convert(sy);
		}
		
		else
		{
			System.out.println("Not good");
		}
		
	}
	
	
	
	public static boolean isNumber(String s)
	{
		boolean answer = true;
		for(int i = 0; i < s.length() && answer; i++)
		{
			char c = s.charAt(i);
			if(c < '0' || c > '9')
				answer = false;

		}
		return answer;
	}
	
	
	
	public static int convert(String s)
	{
		int sum = 0;
		int power = s.length() - 1;
		for (int i = 0; i < s.length(); i++)
		{
			sum = sum + atoi(s.charAt(i)) * (int) Math.pow(10, power);
			power--;
		}
		return sum;
	}
	
	public static int atoi(char c)
	{
		int d = 0;
		switch(c)
		{
			case '0' : d = 0; break;
			case '1' : d = 1; break;
			case '2' : d = 2; break;
			case '3' : d = 3; break;
			case '4' : d = 4; break;
			case '5' : d = 5; break;
			case '6' : d = 6; break;
			case '7' : d = 7; break;
			case '8' : d = 8; break;
			case '9' : d = 9; break;
		}
		return d;
	}
}













