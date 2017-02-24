public class Queue implements QueueInterface {
	private int numElements;
	private Node top;
	private Node tail;

	public Queue(){
		numElements=0;
		top=null;
		tail=null;
	}

	public int size(){
		return this.numElements;
	}
	
	public boolean isEmpty(){
		if (this.size()>0){
			return false;
		} else {
			return true;
		}
	}

	public void enqueue(Object info){
		if (info != null){
			Node node = new Node(info);
			if (top == null){
				top = node;
			}
			if (tail != null){
			        tail.setNext(node);
			}
			tail=node;
			numElements++;
		}
	}

	public Object front(){
		if (top != null){
		        return (top.getInfo());
		} else return null;
	}
	
	public Object dequeue(){
		if (top != null){
			Object aux = top.getInfo();
			top = top.getNext();
			numElements--;
			if (this.top == null){
				this.tail=null;
			}
			return aux;
		} else return null;
	}
	
	public void printInfo(){
		System.out.println("********* QUEUE DUMP *********");
		System.out.println("   Size: " + this.numElements);
		this.printQueueContent();
		System.out.println("******************************");
	}
	
	public Object getNth(int pos){
		Node next=this.top;
		int actpos=1;
		if (pos>this.numElements){
			return null;
		} else if (pos<=0) {
			return null;
		} else {
			while (actpos < pos){
			        next=next.getNext();
				actpos++;
			}
			return next.getInfo();
		}
	}

       private void printQueueContent (){
               int i;
               for (i=1;i<=this.size();i++){
                       System.out.println("   ** Element " + i);
                       Order po = (Order) this.getNth(i);
                       if (po != null) {
                               po.print();
                       }
               }
       }
}
