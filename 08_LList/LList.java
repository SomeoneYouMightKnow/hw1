public class LList {
    private Node l = null;
    private Node dummy = null;
    private int len = 0;

    public void add(String s) {
	Node in = new Node(s);
        in.setNext(l);
	l = in;
	len++;
    }

    public String toString() {
	String s = "";
	Node tmp;
	for (tmp=l; tmp != null; tmp = tmp.getNext()) {
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public String get( int n ) {
	Node output = l;
	for (int i = 0; i < n; i++) {
	    output = output.getNext();
	}
	return output.getData();
    }

    public void add( int n, String s ) {
	Node insert = new Node(s);
	Node temp = l;
	for (int i = 0; i < n-1; i++) {
	    temp = temp.getNext();
	}
	if ( n == 0 ) {
		insert.setNext(l);
	} else {
		insert.setNext(temp.getNext());
		temp.setNext(insert);
    	}
	len++;
    }

    public boolean remove( int n ) {
	Node temp = new Node();
	for (int i = 0; i < n; i++) {
	    temp = temp.getNext();
	}
	temp.setnext(temp.getNext().getNext());
	len--;
    }

    
}
