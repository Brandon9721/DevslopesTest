class Buffer
{
    private int contents;
    
    public void put(int i)
    {
        contents = i;
        System.out.println("Producer put: " + i);
    }
    
    public int get()
    {
        int val = contents;
        System.out.println("Consumer got: " + val);
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
            buf.put(i);
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
            value = buf.get();
        }
    }

}


class TestNoSync
{
    public static void main(String[] args)
    {
        Buffer buf = new Buffer();
        
        Producer p = new Producer(5, buf);
        Consumer c = new Consumer(5, buf);
        
        p.start();  c.start();
        
        System.out.println("END-OF-MAIN-THREAD");
    }
}

