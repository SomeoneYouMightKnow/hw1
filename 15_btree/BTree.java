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


    }

    public int longest( Node t ) {
	
	
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
