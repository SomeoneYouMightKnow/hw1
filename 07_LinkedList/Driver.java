public class Driver {
    public static void main(String[] args) {
	Node n = new Node("Hello");
	//System.out.println(n);
	//System.out.println(n.getData());

	Node n2 = new Node("World");
	//System.out.println(n2.getData());

	n.setNext(n2);
	//System.out.println(n.getNext());

	n2.setData("pickle");
	//System.out.println(n.getNext());

	n.getNext().setData("watermelon");
	//System.out.println(n.getNext());

	n.getNext().setNext(new Node("abc"));
	//System.out.println(n2.getNext());

	n.getNext().getNext().setNext(new Node("aaa"));
	//System.out.println(n2.getNext().getNext());

	Node tmp = new Node("first");
	tmp.setNext(n);
	n = tmp;

	//System.out.println(n);
	//System.out.println(n.getNext());

	for(Node i = n; i != null; i = i.getNext()) {
	    // System.out.println(i);
	}

	LinkedList l = new LinkedList();
	l.add("hello");
	l.add("world");
	System.out.println(l);

    }


}
