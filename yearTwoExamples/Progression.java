abstract class Progression
{
	protected int cur;
	
	abstract protected int nextValue();
	
	public void print(int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print(nextValue() + " ");
		}
		System.out.println();
	}
}

class ArithmeticProgression extends Progression
{
	private int inc;
	
	public ArithmeticProgression()
	{
		cur = 0;
		inc = 1;
	}
	
	public ArithmeticProgression(int inc)
	{
		this.inc = inc;
	}
	
	public int nextValue()
	{
		cur = cur + inc;
		return cur;
	}
}

class GeometricProgression extends Progression
{
	private int base;
	
	public GeometricProgression()
	{
		base = 2;
		cur = 1;
	}
	
	public GeometricProgression(int base)
	{
		this.base = base;
		cur = 1;
	}
	
	public int nextValue()
	{
		cur = cur * base;
		return cur;
	}
}
	


class TestProgression
{
	public static void main(String[] args)
	{
		Progression[] p = new Progression[4];
		p[0] = new ArithmeticProgression();
		p[1] = new ArithmeticProgression(5);
		p[2] = new GeometricProgression();
		p[3] = new GeometricProgression(3);
		
		for(int i = 0; i < p.length; i++)
		{
			p[i].print(10);
		}
	}
}















