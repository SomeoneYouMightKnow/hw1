public class BinTree {
    private Node root;

    public BinTree() {
	this(null);
    }

    public BinTree( Node n ) {
	root = n;
    }
    
    public Node search( Node t, int i ) {
	Node temp = t;
	while (temp != null) {
	    int c = temp.getData();
	    if (c==i) {
		return temp;
	    }
	    else if ( c > i ) {
		temp = temp.getRight();
	    }
	    else {
		temp = temp.getLeft();
	    }
	}
	return null;
    }
 
    public void insert( Node t, int i ) {
	Node temp1 = t;
	Node temp2 = null;
	Node insert = new Node(null,null,i);

	if (t = null) {
	    t = insert;
	}
	
	while (temp1 != null) {
	    int c = temp1.getData();
	    if ( c > i ) {
		temp2 = temp1;
		temp1 = temp1.getRight();
	    } else if ( c < i ) {
		temp2 = temp1;
		temp1 = temp1.getLeft();
	    } //assume no duplicate case
	}
	int c2 = temp2.getData();
	if ( c2 > i ) {
	    temp2.setLeft(insert);
	} else if ( c2 < i ) {
	    temp2.setRight(insert);
	}
    }

    
}
