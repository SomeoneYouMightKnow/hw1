public class BinTree {
    private Node root;

    public BinTree() {
	this(null);
    }

    public BinTree( Node n ) {
	root = n;
    }


    /*
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
    */

    //Now do it recursively
    public Node search( Node t, int i ) {
	if ( t == null || t.getData() == i ) {
	    return t;
	} else if ( t.getData() < i ) {
	    return search( t.getRight(), i );
	} else {
	    return search( t.getLeft(), i );
	}
    }

    public String search( int i ) {
	Node retval = search( root, i );
	if ( retval == null) {
	    return "Not found";
	} else {
	    return "" + retval;
	}
    }
 
    public void insert( int i ) {
	Node insert = new Node(i);
	Node t2 = null;
	Node t = root;

	if ( root == null ) {
	    root = insert;
	    return;
	}
		
	while (t != null) {
	    t2 = t;
	    if ( t.getData() == i ) 
		return;
	     else if ( t.getData() < i ) 
		t = t.getRight();
	     else if ( t.getData() > i ) 
		t = t.getLeft();
	     else 
		return;
	    
	}
	
	if ( i > t2.getData() ) 
	    t2.setRight(insert);
	 else 
	    t2.setLeft(insert);
	
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
	BinTree t = new BinTree();
        t.insert(40);
        t.insert(50);
        t.insert(20);
        t.insert(7);
        t.insert(33);
        t.insert(60);
        t.insert(21);
        t.insert(5);
        t.insert(23);
        t.insert(13);
        
	System.out.println(t);
	//t.insert(30);
	System.out.println(t.search(30));
	System.out.println(t.search(20));

    }
    
}
