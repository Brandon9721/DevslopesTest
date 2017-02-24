// Brandon Byrne (20115464)
// Data Structures and Algorithms
// Jan. 30, 2017
// Amjad Kashif

class BNode {
    private int data;
    private BNode leftLink;
    private BNode rightLink;
    
    public BNode() {
        data = 0;
        leftLink = rightLink = null;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public int getData() {
        return data;
    }

    public void setLeftLink(BNode leftLink) {
        this.leftLink = leftLink;
    }
    
    public BNode getLeftLink() {
        return leftLink;
    }

    public void setRightLink(BNode rightLink) {
        this.rightLink = rightLink;
    }
    
    public BNode getRightLink() {
        return rightLink;
    }
}
