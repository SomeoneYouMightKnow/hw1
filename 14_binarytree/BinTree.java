import java.io.*;
import java.util.*;

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
	} else if ( t.getData() > i ) {
	    return search( t.getLeft(), i );
	} else if ( t.getData() < i ) {
	    return search( t.getRight(), i );
	} else {
	    return null;
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
	Node temp1 = root;
	Node temp2 = null;
	Node insert = new Node(null,null,i);

	if ( root == null ) {
	    root = insert;
	    return;
	}
		
	while (temp1 != null) {
	    temp2 = temp1;
	    int c = temp1.getData();
	    if ( c == i ) {
		return;
	    } else if ( c < i ) {
		temp1 = temp1.getRight();
	    } else if ( c > i ) {
		temp1 = temp1.getLeft();
	    } else {
		return;
	    }
	}
	int c2 = temp2.getData();
	if ( i > c2 ) {
	    temp2.setLeft(insert);
	} else {
	    temp2.setRight(insert);
	}
    }


    public String traverse( Node t ) {
	String s = "";
	if ( t == null ) {
	    return "";
	}
	if ( t.hasLeft() ) {
	    s += traverse( t.getLeft() );
	} else if ( t.hasRight() ) {
	    s += traverse( t.getRight() );
	} else if ( !t.hasLeft() && !t.hasRight() ) {
	    s+= t.getData();
	}
	return s;
    }
    
    public String toString() {
	return traverse(root);
    }


    public static void main(String args[]) {
	BinTree t = new BinTree();
	Random r = new Random();
	for ( int i = 0; i < 20; i++ ) {
	    int z = r.nextInt(100);
	    System.out.println(z);
	    t.insert(z);
	}
	System.out.println(t);
	//t.insert(30);
	System.out.println(t.search(30));

    }
    
}
