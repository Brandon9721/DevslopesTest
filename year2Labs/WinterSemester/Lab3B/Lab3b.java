// Brandon Byrne (20115464)
// Lab 3B February 21, 2017
// Data Structures and Algorithms, Kashif Amjad

class Lab3b {
    public static void main(String[] args){
        QueueB q = new QueueB();
        int random1 = (int)(Math.random() * 1000);
        int random2 = (int)(Math.random() * 1000);
        int random3 = (int)(Math.random() * 1000);
        int random4 = (int)(Math.random() * 1000);
        int random5 = (int)(Math.random() * 1000);
        int random6 = (int)(Math.random() * 1000);
        int random7 = (int)(Math.random() * 1000);
        int random8 = (int)(Math.random() * 1000);
        int random9 = (int)(Math.random() * 1000);
        int random10 = (int)(Math.random() * 1000);
        
        
        System.out.printf("\nq.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n" +
                          "q.enqueueB(%d);\n\n", random1, random2, random3, random4, random5, random6, random7, random8, random9, random10);
        
        
        
        q.enqueueB(random1);
        q.enqueueB(random2);
        q.enqueueB(random3);
        q.enqueueB(random4);
        q.enqueueB(random5);
        q.enqueueB(random6);
        q.enqueueB(random7);
        q.enqueueB(random8);
        q.enqueueB(random9);
        q.enqueueB(random10);
        System.out.println("Queue displayed same order as it was entered into nodes\n" + q + "\n");
        
        System.out.println("\nq.dequeueB(); // This will search the queue and remove smallest integer\n");
        q.dequeueB();
        System.out.println(q);
        System.out.println(" ");
        
        System.out.println("\nq.dequeueB();");
        q.dequeueB();
        System.out.println(q);
        
        System.out.println("\nq.dequeueB();");
        q.dequeueB();
        System.out.println(q);
        System.out.println(" ");
    }
}

class QueueB {
    private DNodeB head;
    private DNodeB tail;
    private int size;
    
    public QueueB() {
        head = tail = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }
    
    public void enqueueB(int data) {
        DNodeB n = new DNodeB();
        n.setData(data);
        if(isEmpty()){
            head = n;
            tail = n;
        }
        else {
            tail.setNext(n);
            n.setPrevious(tail);
        }
        tail = n;
        size++;
    }
    public void printForward(){
        if(isEmpty()){
            System.out.println("There is nothing to print.");
        }
        else{
            System.out.println("Now printing data forward.");
            DNodeB temp = head;
            while(temp != null){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }
    
    public void dequeueB(){
        if(isEmpty())
            System.out.println("Queue is empty");
        else if(size == 1) {
            head = tail = null;
            size = 0;
        }
        else {
            DNodeB temp = head;
            DNodeB temp2 = head;
            while(temp != null){
                if(temp2.getData() >= temp.getData()){
                    temp2 = temp;
                }
                temp = temp.getNext();
            }
            
            if(temp2 == head){
                head = temp2.getNext();
                head.setPrevious(null);
                size--;
                System.out.println(temp2.getData() + " is removed from list");
            }
            else if(temp2 == tail){
                tail = temp2.getPrevious();
                tail.setNext(null);
                size--;
                System.out.println(temp2.getData() + " is removed from list");
            }
            else {
                temp2.getPrevious().setNext(temp2.getNext());
                temp2.getNext().setPrevious(temp2.getPrevious());
                size--;
                System.out.println(temp2.getData() + " is removed from list");
            }
            
        }
    }
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        DNodeB temp = head;
        while(temp != null) {
            if(temp.getNext() == null)
                sb.append(temp.getData());
            else
                sb.append(temp.getData() + ", ");
            temp = temp.getNext();
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}

class DNodeB {
    private int data;
    private DNodeB previous;
    private DNodeB next;
    
    public DNodeB() {
        data = 0;
        previous = null;
        next = null;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public int getData() {
        return data;
    }
    
    public void setPrevious(DNodeB previous) {
        this.previous = previous;
    }
    
    public DNodeB getPrevious() {
        return previous;
    }
    
    public void setNext(DNodeB next) {
        this.next = next;
    }
    
    public DNodeB getNext() {
        return next;
    }
}


