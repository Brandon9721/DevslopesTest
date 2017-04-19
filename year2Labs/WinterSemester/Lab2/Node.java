// class example on Nodes


class Node {
    private int data;
    private Node link;
    
    public Node() {
        data = 0;
        link = null;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public int getData() {
        return data;
    }
    
    public void setLink(Node link) {
        this.link = link;
    }
    
    public Node getLink() {
        return link;
    }
}

class TestNode {
    public static void main(String[] args) {
        Node n1, n2, n3, temp;
        
        n1 = new Node();
        n2 = new Node();
        n3 = new Node();
        
        n1.setData(1); n1.setLink(n2);
        
        n2.setData(2); n2.setLink(n3);
        
        n3.setData(3);
        
        temp = n1;
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getLink();
        }
        System.out.println();
    }
}
