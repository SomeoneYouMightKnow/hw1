public class LinkedList {
    private Node l = null;

    public void add(String s) {
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	
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

    public String find( int n ) {
	Node output = l;
	for (int i = 0; i < n; i++) {
	    output = output.getNext();
	}
	return output.getData();
    }

    public void insert( int n, String s ) {
	Node temp = l;
	for (int i = 0; i < n-1; i++) {
	    temp = temp.getNext();
	}
	Node insert = new Node(s);
	insert.setNext(temp.getNext());
	temp.setNext(insert);
    }
    
}
