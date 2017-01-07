interface Vehicle
{
	void moveForward(int x);
	void moveBackward(int x);
}

interface Aircraft extends Vehicle
{
	void moveDown(int y);
	void moveUp(int y);
}

class Car implements Vehicle
{
    private String model;
    
    public Car(String model)
    {
        this.model = model;
    }
    
    public void moveForward(int x)
    {
        System.out.println("Moved forward by: " + x);
    }
    
    public void moveBackward(int x)
    {
        System.out.println("Moved backward by: " + x);
    }
}

class Airplane implements Aircraft
{
    private String model;
    
    public Airplane(String model)
    {
        this.model = model;
    }
    
    public void moveForward(int x)
    {
        System.out.println("Moved forward by: " + x);
    }
    
    public void moveBackward(int x)
    {
        System.out.println("Moved backward by: " + x);
    }
    
    public void moveUp(int x)
    {
        System.out.println("Moved up by: " + x);
    }
    
    public void moveDown(int x)
    {
        System.out.println("Moved down by: " + x);
    }
    
    
    
}


class Test
{
    public static void main(String[] args)
    {
        Car c = new Car("BMW");
        c.moveForward(120);
        c.moveBackward(10);
        
        Airplane a = new Airplane("AC130");
        a.moveForward(10000);
        a.moveUp(75000);
        a.moveBackward(0);
        a.moveDown(0);
    }
}
