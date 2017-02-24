public interface QueueInterface {



    // returns the number of elements in Queue

    public int size();                   



    // verifies if the Queue is empty. true if empty | false if not empty.

    public boolean isEmpty();



    // returns the first element in Queue. The element IS NOT REMOVED from Queue. Returns null if empty.

    public Object front();



    // adds a new element to the Queue.

    public void enqueue(Object info);

 

    // returns the first element in Queue. The element IS REMOVED from Queue. Returns null if empty.

    public Object dequeue();

} 

