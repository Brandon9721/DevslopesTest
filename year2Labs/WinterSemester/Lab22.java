/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  Java Data Structures and Algorithms Lab2 part 2                    *
 *  http://branko-cirovic.appspot.com/CP2530/Labs/Lab2.html            *
 *  Name: Brandon Byrne (20115464)                                     *
 *  Date: Jan. 6, 2017                                                 *
 *  Instructor: Amjad Kashif                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
import java.io.*;
import java.lang.*;

class DNode {
    private int data;
    private DNode next;
    private DNode previous; // initialized privated variables needed for nodes
    
    
    public DNode() { // constructor for default empty node
        data = 0;
        next = null;
        previous = null;
    }
    
    // getters and setters for private data fields created above
    public void setData(int data) {
        this.data = data;
    }
    
    public int getData() {
        return data;
    }
    
    public void setPrevious(DNode previous) {
        this.previous = previous;
    }
    
    public DNode getPrevious() {
        return previous;
    }
    
    public void setNext(DNode next) {
        this.next = next;
    }
    
    public DNode getNext() {
        return next;
    }
}

class DLinkedList {
    private DNode head;
    private DNode tail;
    private int size = 0; // initialize private data fields
    
    public DLinkedList() { // constructor for empty list
        head = tail = null;
        size = 0;
    }
    
    public void insert(int x) { // inserts new data point to end of linked list
        DNode node = new DNode();
        
        node.setData(x);
        
        if(size == 0) {
            head = tail = node;
        } else {
            //head.setNext(node);
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
//            node.setPrevious(head);
        }
        
        tail = node;
        size++;
    }
    
    
    public void remove() { // remove last data element entered into list
        if(size == 0) {
            System.out.println("There is nothing to remove, list is empty");
        } else if(size == 1) {
            head = tail = null;
            size--;
        } else {
            DNode tempNode = head;
            while(tempNode.getNext() != tail) {
                tempNode = tempNode.getNext();
            }
            
            tail = tempNode;
//            tail.setPrevious(null); // * check tomorrow if needed
            tail.setNext(null);
            size--;
        }
    }
    
    public void remove(int x) {
        
        
        if(size == 0) {
            System.out.println("There is nothing to remove, list is empty");
        }
        
        else if(size == 1) {
            head = tail = null;
            size = 0;
        }
        
        else {
            boolean isPresent = false;
            
            DNode temp = this.head; // set temp node
            while (temp != null) {
                if (x == temp.getData() && temp == head) { // if number is found in the head
                    head = head.getNext();
                    head.setPrevious(null); // sets head to next node and deletes prev node
                    size--;
                    System.out.println(x + " is removed from list");
                    isPresent = true;
                    
                } else if (x == temp.getData() && temp == tail) { // if number is found in the tail
                    tail = tail.getPrevious();
                    if (tail != null) {
                        tail.setNext(null); // sets tail to previous node and deletes last node
                    }
                    size--;
                    System.out.println(x + " is removed from list");
                    isPresent = true;
                } else if (x == temp.getData()) { // else if data is between head and tail, remove it
                    if(temp.getPrevious() != null) {
                        temp.getPrevious().setNext(temp.getNext());
                        
                    } else {
                        head = temp.getNext();
                    }
                    
                    if(temp.getNext() != null) {
                        temp.getNext().setPrevious(temp.getPrevious());
                    } else {
                        tail = temp.getPrevious();
                    }
                    size--;
                    System.out.println(x + " is removed from list");
                    isPresent = true;
                }
                temp = temp.getNext(); // keep while loop going until null
            }
            
            if(!isPresent) {
                System.out.println(x + " is not present in the list");
            }
            
            isPresent = false;
        }
        
    }
    
    public String toString()
    {
        String printString = "";
        if (size == 0) {
            printString = "List is empty\n";
        } else {
            DNode tempNode = head;
            printString += "\nDoubly Linked List Data:\n";
            
            while (tempNode != null) {
                printString += tempNode.getData() + " ";
                tempNode = tempNode.getNext();
            }
            printString += " - End of List\n";
        }
        return printString;
    }
    
    public String reverse()
    {
        String reversedList = "";
        if (size == 0) {
            reversedList = "List is empty, can't print in reverse\n";
        } else {
            reversedList += "\nReversed List:\n";
            DNode tNode = tail;
            while (tNode != null) {
                reversedList += tNode.getData() + " ";
                tNode = tNode.getPrevious();
            }
            reversedList += "\n";
        }
        return reversedList;
    }
    
    
    
    
    
    //    public void printList() { // function that prints each data point in list in order they were added in
    //        if(size == 0) {
    //            System.out.println("\nList is empty\n");
    //        } else {
    //            System.out.println("\nDoubly Linked List Data:");
    //            DNode tempNode = head;
    //
    //            while(tempNode != null) {
    //                System.out.print(tempNode.getData() + " ");
    //                tempNode = tempNode.getNext();
    //            }
    //            System.out.println("End List\n");
    //        }
    //    }  Not needed anymore, Use toString instead
}

class Lab22 {
    public static void main(String[] args) {
        DLinkedList List = new DLinkedList();
        
        System.out.println("\nTest all class methods:\n\n" + List);
        System.out.println("List.insert(5);\nList.insert(5);\nList.insert(10);\nList.insert(20);\n" +
                           "List.insert(30);\nList.insert(5);\nList.insert(40);\nList.insert(655);\nList.insert(5);\n" +
                           "List.insert(5);\nList.insert(999);\nList.insert(-100);\n");

        List.insert(5);
        List.insert(5);
        List.insert(10);
        List.insert(20);
        List.insert(30);
        List.insert(5);
        List.insert(40);
        List.insert(655);
        List.insert(5);
        List.insert(5);
        List.insert(999);
        List.insert(-100); // insert data
      
        System.out.println(List); // print list
        System.out.println("List.remove();\nList.remove();\n");
        
        List.remove();
        List.remove(); // remove last 2 inputted values
        System.out.println(List);

        System.out.println("\nList.remove(5);\n");

        List.remove(5); // remove all instances of '5'
        System.out.println(List);

        System.out.println("\nList.remove(5);\n");
        
        List.remove(5); // try to remove '5' again (should be none left since they were just removed)
        System.out.println(List);

        System.out.println("\nList.insert(25);\nList.insert(35);\nList.insert(45);\n");
        
        List.insert(25);
        List.insert(35);
        List.insert(45); // insert some more data for good measures

        System.out.println(List);

        System.out.println("\nSystem.out.println(List.reverse());");
        
        System.out.println(List.reverse()); // print list in reverse

    } // end main
} // end of Lab22 class




class testDLinkList { // method testing class
    public static void main(String[] args) {
        DLinkedList testList = new DLinkedList();
        
        testList.insert(5);
        testList.insert(10);
        testList.insert(15);
        testList.insert(20);
        testList.insert(25);
        testList.insert(30);
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        
        //testList.printList();
        System.out.println(testList);

        
//        testList.remove();
        testList.remove();
        //testList.printList();
        System.out.println(testList);

        
        testList.remove(5);
        //testList.printList();
        System.out.println(testList);


        testList.remove(5);
        //testList.printList();
        System.out.println(testList);

        
        testList.insert(25);
        testList.insert(35);
        testList.insert(45);

        //testList.printList();
        System.out.println(testList);

        testList.reverse();
        System.out.println(testList.reverse());
        
        System.out.println(testList);
        //testList.printList();
    }
}
