public class Node {
    private Node Left, Right;
    private int data;

    public Node() {
	this(null,null,0);
    }

    public Node( int d ) {
	this(null,null,d);
    }
    
    public Node( Node l, Node r, int d ) {
	Left = l;
	Right = r;
	data = d;
    }

    public Node getLeft() {
	return Left;
    }

    public void setLeft( Node n ) {
	Left = n;
    }

    public boolean hasLeft() {
	return Left != null;
    }
    
    public Node getRight() {
	return Right;
    }
    
    public void setRight( Node n ) {
	Right = n;
    }

    public boolean hasRight() {
	return Right != null;
    }

    public boolean isLeaf() {
	return !(hasRight() || hasLeft());
    }
    
    public int getData() {
	return data;
    }
    
    public void setData( int n ) {
	data = n;
    }

    public String toString(){
	return ""+data;
    }
    
}
