public class Node {
	private Node next;
	private Object info;
	
	public Node (Object info, Node next) {
		this.next = next;
		this.info = info;
	}

	public Node(Object info) {
		this.next = null;
		this.info = info;
	}

	public Node() {
		this.next = null;
		this.info = null;
	}

	public Object getInfo() {
		return info;
	}

	public Node getNext() {
		return next;
	}

        public void setInfo(Object info) {
	        this.info = info;
	}

        public void setNext(Node next) {
	    this.next = next;
	}
}