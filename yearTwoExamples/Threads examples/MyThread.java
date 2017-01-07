class MyThread implements Runnable
{
    private String name;
    
    public MyThread(String name)
    {
        this.name = name;
    }
    
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.print(name + " ");
            try
            {
                Thread.sleep(100);
                // change this in to 1,  change to 1000. test
            }
            catch(InterruptedException e)
            {
                
            }
        }
    }
}


class TestMyThread
{
    public static void main(String[] args)
    {
        MyThread mr1 = new MyThread("A");
        MyThread mr2 = new MyThread("1");
        
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        
        t1.start();
        
        t2.start();
    }
}
