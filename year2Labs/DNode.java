// Brandon Byrne (20115464) Doubly Linked List
// Jan. 24, 2017

class DNode {
    private int data;
    private DNode next;
    private DNode prev;
    
    
    public Node() {
        data = 0;
        next = null;
        prev = null;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public int getData() {
        return data;
    }
    
    public void setPrevious(DNode prev) {
        this.prev = prev;
    }
    
    public Node getPrevious() {
        return previous;
    }
    
    public setNext(DNode next) {
        this.next = next;
    }
    
    public getPrev() {
        return next;
    }
    
}
