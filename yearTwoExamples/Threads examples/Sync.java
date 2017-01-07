class Buffer
{
    private int contents;
    private boolean empty = true;
    
    public synchronized void put(int i) throws InterruptedException
    {
        while(empty == false)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
            
            }
        }
        contents = i;
        empty = false;
        System.out.println("Producer put: " + i);
        notify();
    }
    
    public synchronized int get() throws InterruptedException
    {
        while(empty == true)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                
            }
        }
        
        int val = contents;
        empty = true;
        System.out.println("Consumer got: " + val);
        notify();
        return val;
    }
    
}

class Producer extends Thread
{
    private int n;
    private Buffer buf;
    
    public Producer(int n, Buffer buf)
    {
        this.n = n;
        this.buf = buf;
    }
    
    public void run()
    {
        for(int i = 0; i < n; i++)
        {
            try
            {
                buf.put(i);
            }
            catch(InterruptedException e)
            {
                
            }
            
        }
    }
}

class Consumer extends Thread
{
    private int n;
    private Buffer buf;
    
    public Consumer(int n, Buffer buf)
    {
        this.n = n;
        this.buf = buf;
    }
    
    public void run()
    {
        int value;
        for(int i = 0; i < n; i++)
        {
            try
            {
                value = buf.get();
            }
            catch(InterruptedException e)
            {
                
            }
        }
    }
    
}


class TestSync
{
    public static void main(String[] args)
    {
        Buffer buf = new Buffer();
        
        Producer p = new Producer(5, buf);
        Consumer c = new Consumer(5, buf);
        
        p.start();  c.start();
        try
        {
            p.join();
            c.join();
        }
        catch(InterruptedException e)
        {
            
        }
        
        System.out.println("END-OF-MAIN-THREAD");
    }
}

