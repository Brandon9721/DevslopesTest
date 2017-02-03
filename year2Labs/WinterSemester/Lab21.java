// Brandon Byrne (20115464) Linked Lists Lab
// Jan. 24, 2017

import java.util.*;

class LinkedList {
    // Set private data fields
    private Node head;
    private Node tail;
    int size;
    
    // linked list constructor creates empty list
    public LinkedList() {
        head = tail = null;
        size = 0;
    }
    
    // boolean to test if list is empty
    public boolean isEmpty() {
        if(size == 0)
            return true;
        else
            return false;
    }
    
    // inserts data into the linked list
    public void insert(int data) {
        Node n = new Node();
        n.setData(data);
        
        if(isEmpty())
            head = n;
        else
            tail.setLink(n);
        
        tail = n;
        size++;
    }
    
    // removes data from the linked list
    public void remove() {
        if(isEmpty())
            System.out.println("Can't remove. List is empty.");
        else if(size == 1) {
            head = tail = null;
            size = 0;
        }
        else {
            Node temp = head;
            while(temp.getLink() != tail)
                temp = temp.getLink();
            tail = temp;
            tail.setLink(null);
            size--;
        }
    }
    
    public int size() {
        return size;
    }
    
    public int[] toArray() {

        if(isEmpty()) {
            int[] a = new int[0];
            System.out.println("Linked list is empty");
            return a;
        }
        else {
            Node temp = head;
            int counter = 0;
            int[] array = new int[this.size];
            
            while(temp != null) {
                array[counter] = temp.getData();
                temp = temp.getLink();
                counter++;
            }
            return array;
        }
    
        
//        return new int[0];
    }
    
    // prints data values if it has any, otherwise states it is empty
    public void print() {
        if(isEmpty())
            System.out.println("List is empty");
        else {
            Node temp = head;
            while(temp != null) {
                System.out.println(temp.getData() + " ");
                temp = temp.getLink();
            }
            System.out.println();
        }
    }
}


class Lab21 {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        int[] array;
        test.print();
        test.insert(5);
        test.print();
        test.insert(100);
        test.print();
        test.insert(50);
        test.print();
        test.insert(123);
        test.print();
        test.insert(25);
        test.print();
        test.insert(19);
        test.print();
        test.insert(86);
        test.print();
        test.insert(9);
        test.print();
        test.print();
        
        array = test.toArray();
        
        System.out.print("\nValues in linked list are:\n[");
        
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
        
        
    }
}
