// Interaction between objects of the same type
// Brandon Byrne (20115464), Sept 26, 2016

class RN
{
	private int nom, denom;
	
	public RN()
	{
		nom = 0;
		denom = 1;
	}
	
	public RN(int nom, int denom)
	{
		this.nom = nom;
		this.denom = denom;
	}
	
	public String toString()
	{
		int g = gcd(nom, denom);
		String s = nom/g + "/" + denom/g;
		return s;
	}


	public RN add(RN r)
	{
		int n = this.nom * r.denom + this.denom * r.nom;
		int d = this.denom * r.denom;
		return new RN(n,d);
	}
	
	public RN subtract(RN r)
	{
		int n = this.nom * r.denom - this.denom * r.nom;
		int d = this.denom * r.denom;
		return new RN(n,d);
	}
	
	public RN multiply(RN r)
	{
		int n = this.nom * r.nom;
		int d = this.denom * r.denom;
		return new RN(n,d);
	}
	
	public RN divide(RN r)
	{
		int n = this.nom * r.denom;
		int d = this.denom * r.nom;
		return new RN(n,d);
	}
	
	public boolean equals(RN r)
	{
		int g1 = gcd(r.nom, r.denom);
		int g2 = gcd(this.nom, this.denom);
		
		if((this.nom/g2 == r.nom/g1) && 
			(this.denom/g2 == r.denom/g1))
			return true;
		else
			return false;
	}


	private int gcd(int m, int n)
	{
		if(m % n == 0)
		{
			return n;
		}
		return gcd(n, m % n);
	}
}

class TestRN
{
	public static void main(String[] args)
	{
		RN r1 = new RN(1,2);
		RN r2 = new RN(3,4);
		
		RN sum = r1.add(r2);
		System.out.println(sum);
		
		RN diff = r1.subtract(r2);
		System.out.println(diff);
		
		RN product = r1.multiply(r2);
		System.out.println(product);
		
		RN quot = r1.divide(r2);
		System.out.println(quot);
		
		RN p = new RN(10,8);
		RN q = new RN(5,4);
		
		if(p.equals(q))
			System.out.println("Giddy up!");
		else
			System.out.println("Bummer!");
	}
}