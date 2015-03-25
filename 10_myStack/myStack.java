public class myStack<E>{
    // You decide how the node(s) are declared

    // make whatever constructor(s) you need

    private Node<E> top;

    public myStack(E s) {
	first = new Node(s);
	top = new Node();
	top.setNext(first);
    }

    public myStack() {
	this(null);
    }

    public void push(E data){
        // add something to the top
	Node<E> insert = new Node<E>(data);
        insert.setNext(top.getNext().getNext());
	top.setNext(insert);
    }

    public E pop(){
        // remove and return the top item from the stack
	Node<E> tmp = top;
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
}
