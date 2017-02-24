import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestQueue {

	public static void main (String [] args){
		Queue q = new Queue();
		
		Order o1=new Order(20,"cust1");
		Order o2=new Order(30,"cust2");
		Order o3=new Order(40,"cust3");
		Order o4=new Order(50,"cust3");
		Order o;
		
		System.out.println("New element");
		q.enqueue(o1);
		q.printInfo();
		System.out.println("New element");
		q.enqueue(o2);
		q.printInfo();
		System.out.println("New element");
		q.enqueue(o3);
		q.printInfo();
		System.out.println("New element");
		q.enqueue(o4);
		q.printInfo();
		System.out.println("New element");
		o=(Order) q.dequeue();
		o.print();
		q.printInfo();
		o=(Order) q.dequeue();
		o.print();
		q.printInfo();
		o=(Order) q.dequeue();
		o.print();
		q.printInfo();
		o=(Order) q.dequeue();
		o.print();
		q.printInfo();
		o=(Order) q.dequeue();
		if (o != null) o.print();
		q.printInfo();
		
		q.enqueue(o1);
		q.printInfo();
		q.enqueue(o2);
		q.printInfo();
		q.enqueue(o3);
		q.printInfo();
		q.enqueue(o4);
		q.printInfo();
		
		o=(Order) q.getNth(3);
		o.print();
		q.printInfo();
	}

}
