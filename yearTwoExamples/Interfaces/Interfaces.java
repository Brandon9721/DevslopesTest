class Person
{
	protected String name;
	protected int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return name + " " + age;
	}
}

interface Chef
{
	public void cook(String dish);
}

interface Musician
{
	public void play(String instrument);
}

class John extends Person implements Chef, Musician
{
	private String sex;
	
	public John(String name, int age, String sex)
	{
		super(name, age);
		this.sex = sex;
	}
	
	public String toString()
	{
		return super.toString() + " " + sex;
	}
	
	public void cook(String dish)
	{
		System.out.println("I can cook " + dish);
	}
	
	public void play(String instrument)
	{
		System.out.println("I can play " + instrument);
	}
}

class TestInterface
{
	public static void main(String[] args)
	{
		John j = new John("Giovanni", 32, "male");
		System.out.println(j);
		j.play("Mandolin");
		j.cook("Buccatini al'amatriciana");
	}
}
		