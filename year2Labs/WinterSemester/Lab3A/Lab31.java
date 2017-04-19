// Brandon Byrne (20115464)
// Lab 3A February 21, 2017
// Data Structures and Algorithms, Kashif Amjad


import java.util.Random;

public class Lab31 {
    public static void main(String[] args){
        QueueA q = new QueueA();
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
        
        
        System.out.printf("\nq.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n" +
                           "q.enqueueA(%d);\n\n", random1, random2, random3, random4, random5, random6, random7, random8, random9, random10);
        
        
        
        q.enqueueA(random1);
        q.enqueueA(random2);
        q.enqueueA(random3);
        q.enqueueA(random4);
        q.enqueueA(random5);
        q.enqueueA(random6);
        q.enqueueA(random7);
        q.enqueueA(random8);
        q.enqueueA(random9);
        q.enqueueA(random10);
        System.out.println("Queue ordered least to greatest:\n" + q + "\n");
        
        System.out.println("\nq.dequeueA(); // This will remove the element at the head\n");
        q.dequeueA();
        System.out.println(q);
        System.out.println(" ");
        
        System.out.println("\nq.dequeueA();\nq.dequeueA();\n");
        q.dequeueA();
        q.dequeueA();
        System.out.println(q);
        System.out.println(" ");

    }
}


class QueueA {
    private DNodeA head;
    private DNodeA tail;
    private int size;
    
    public QueueA() {
        head = tail = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        if(size == 0)
            return true;
        else
            return false;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        DNodeA temp = head;
        while(temp != null) {
            if(temp.getNext() == null) {
                sb.append(temp.getData());
            } else {
                sb.append(temp.getData() + ", ");
            }
            
            temp = temp.getNext();
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
    
    public void enqueueA(int data) {
        DNodeA n = new DNodeA();
        n.setData(data);
        if(isEmpty()) {
            head = n;
            size = 1;
        } else if(size == 1) {
            if(n.getData() < head.getData()) {
                DNodeA temp = head;
                n.setNext(temp);
                head = n;
                tail = temp;
                tail.setPrevious(head);
                size++;
            } else {
                head.setNext(n);
                tail = n;
                tail.setPrevious(head);
                size++;
            }
            
        } else {
            DNodeA temp = head.getNext();
            while(temp != null) {
                if(n.getData() > tail.getData()) {
                    DNodeA swap = tail;
                    swap.setNext(n); n.setPrevious(swap);
                    tail = n;
                    size++;
                    break;
                } else if(n.getData() < head.getData()) {
                    DNodeA swap2 = head;
                    n.setNext(swap2);
                    swap2.setPrevious(n);
                    swap2.setNext(head.getNext());
                    head = n;
                    size++;
                    break;
                } else if(n.getData() <= temp.getData()) {
                    temp.getPrevious().setNext(n);
                    n.setPrevious(temp.getPrevious()); temp.setPrevious(n);
                    n.setNext(temp);
                    size++;
                    break;
                } else {
                    temp = temp.getNext();
                    
                }
            }
        }
    }
    public void dequeueA() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        }  else if(size == 1) {
            System.out.println("Removing " + head.getData() + " from the Queue.");
            head = tail = null;
            size = 0;
        } else {
            System.out.println("Removing " + head.getData() + " from the Queue.");
            head = head.getNext();
            size--;
        }
    }
}

class DNodeA {
    private int data;
    private DNodeA previous;
    private DNodeA next;
    
    public DNodeA() {
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
    
    public void setPrevious(DNodeA previous) {
        this.previous = previous;
    }
    
    public DNodeA getPrevious() {
        return previous;
    }
    
    public void setNext(DNodeA next) {
        this.next = next;
    }
    
    public DNodeA getNext() {
        return next;
    }
}
    

