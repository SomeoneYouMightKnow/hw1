public class BTree {
    private Node root;

    public BTree() {
	this(null);
    }

    public BTree( Node n ) {
	root = n;
    }

    public int numNodes( Node t ) {
	if ( t == null ) {
	    return 0;
	} else {
    	    return 1 + numNodes( t.getLeft() ) + numNodes( t.getRight() );
	    //sumOfValues is t.getData()+sumOfValues(left)+sumOfValues(right)
	}
    }

    public int maxValue( Node t ) {
	int max = t.getData();
	if ( t != null ) {
	    if ( max <= maxValue(t.getLeft()) ) {
		max = maxValue(t.getLeft());
	    }
	    if ( max <= maxValue(t.getRight()) ) {
		max = maxValue(t.getRight());
	    }
	}
	return max;
    }

    public int height( Node t ) {
	if ( t == null ) {
	    return 0;
	} else {
	    if (height(t.getRight()) > height(t.getLeft())) {
		return 1 + height(t.getRight());
	    } else {
		return 1 + height(t.getLeft());
	    }
	}
    }

    public void splitDupes( Node t ) {
	if ( t.getNext().getData() == t.getData() ) {
	    Node tmp = new Node( t.getData()-1 );
	    tmp.setNext( t.getNext() );
	    t.setNext( tmp );
	} else {
	    splitDupes( t.getLeft() );
	    splitDupes( t.getRight() );
	}
    }

    public int diameter( Node t ) {
	if ( t == null ) {
	    return 0;
	} else {
	    int p1 = height( t.getLeft() ) + height( t.getRight() ) + 2;
	    int p2 = diameter( t.getLeft() );
	    int p3 = diameter( t.getRight() );
	    if  ( p1 > p2 && p1 > p3 ) {
		return p1;
	    } else if ( p2 > p1 && p2 > p3 ) {
		return p2;
	    } else {
		return p3;
	    }
	}
    }

    
    
    public String traverse( Node t ) {
	if ( t == null ) {
	    return "";
	} else {
	    return  traverse( t.getLeft() ) +
		t.getData() + " " +
		traverse( t.getRight() );
	}
    }
    
    public String toString() {
	return traverse(root);
    }


    public static void main(String args[]) {
	BTree t = new BTree();
    }


}
