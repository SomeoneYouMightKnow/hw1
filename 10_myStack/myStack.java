public class myStack<E>{
    // You decide how the node(s) are declared

    // make whatever constructor(s) you need

    private Node<E> top;

    public myStack() {
	this(null);
    }

    public myStack(E s) {
	Node<E> first = new Node<E>(s);
	top = new Node<E>();
	top.setNext(first);
    }

    public void push(E data){
        // add something to the top
	Node<E> insert = new Node<E>(data);
        insert.setNext(top.getNext().getNext());
	top.setNext(insert);
    }

    public E pop(){
        // remove and return the top item from the stack
	E tmp = top.getData();
        top.setNext(top.getNext().getNext());
	return tmp;
    }

    public boolean empty(){
	return top.getNext() == null;
    }

    public E top() {
        // return the top item from the stack
	return top.getNext().getData();
    }

    public String toString() {
	String s = "";
	for (Node tmp = new Node(); tmp.getNext() != null; tmp = tmp.getNext()) {
	    s += tmp.getData();
	}
	return s;
    }

}
