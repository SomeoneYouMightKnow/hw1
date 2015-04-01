public class myQueue<E>{
    // You decide how the node(s) are declared
    Node<E> front, back, first;

    // make whatever constructor(s) you need

    public myQueue() {
	this(null);
    }
    
    public myQueue(E s) {
	front = new Node<E>();
	first = new Node<E>(s);
	back = new Node<E>();
	front.setNext(first);
	first.setNext(back);
	first.setPrev(front);
	back.setPrev(first);
    }
	
    public void enqueue(E data){
        // add something to the tail/last
	if (empty()) {
	    first.setData(data);
	} else {
	Node<E> insert = new Node<E>(data);
	insert.setNext(back);
	back.getPrev().setNext(insert);
	insert.setPrev(back.getPrev());
	back.setPrev(insert);
	}
    }

    public E dequeue(){
        // remove and return the head/front item from the stack
	Node<E> tmp = first;
	first = first.getNext();
	first.setPrev(front);
	front.setNext(first);
	return tmp.getData();
    }

    public boolean empty(){
	return first.getData() == null;
    }

    public E head() {
        // return the first item in the queue
	return first.getData();
    }

    public String toString(){
	String s = "";
	for (Node<E> tmp = front; tmp!=back; tmp=tmp.getNext()){
	    s += tmp + " --> ";
	}
	s += back;
	return s;
    }

    
}
