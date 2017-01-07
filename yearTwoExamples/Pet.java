abstract class Pet
{
	protected String name;
	
	public Pet(String name)
	{
		this.name = name;
	}
	
	public void eat()
	{
		System.out.println("Yum!");
	}
	
	public void sleep()
	{
		System.out.println("Went to bed");
	}
	
	public String toString()
	{		
		return name + " says " + makeSound();
	}
	
	abstract protected String makeSound();
}




class Dog extends Pet
{
	public Dog(String name)
	{
		super(name);
	}
	
    
    public String makeSound()
    {
        String s1 = "woof woof";
        return s1;
    }
//	public void makeSound()
//	{
//		System.out.println("Woof! Woof!");
//	}
}

class Cat extends Pet
{
	public Cat(String name)
	{
		super(name);
	}
	
    public String makeSound()
    {
        String s2 = "Meow";
        return s2;
    }
//	public void makeSound()
//	{
//		System.out.println("Meoow!");
//	}
}

class TestPet
{
	public static void main(String[] args)
	{
		Dog d = new Dog("Hilda");
		Cat c = new Cat("Marbles");

	Pet[] pets = new Pet[2];
	pets[0] = d;
	pets[1] = c;
	
	for(int i = 0; i < pets.length; i++)
	{
		System.out.println(pets[i]);
		pets[i].eat(); pets[i].sleep();
//        pets[i].makeSound();
        System.out.println(pets[i].makeSound());
    }
		



		
//		System.out.println(d);
//		d.eat(); d.sleep(); d.bark();
		
//		System.out.println(c);
//		c.eat(); c.sleep(); c.meow();
	}
}
