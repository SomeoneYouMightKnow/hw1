public class BinTree {
    private Node root;

    
    public Node search(int i ) {
	Node t = root;
	while (t != null) {
	    int c = t.getData().compareTo(i);
	    if (c==0) {
		return t;
		else if ( c > 0 ) {
		    t = t.getRight();
		    else {
			t = t.getLeft();
		    }
		}
		return null;
	    }



}
