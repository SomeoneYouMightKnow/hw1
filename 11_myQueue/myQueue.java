public class myQueue<E>{
    // You decide how the node(s) are declared
    Node<E> front, back, first;

    // make whatever constructor(s) you need\
    public myQueue() {
	front = new Node<E>();
	first = new Node<E>();
	back = new Node<E>();
	front.setNext(first);
	first.setNext(back);
	first.setPrev(front);
	back.setPrev(first);
    }
	
    public void enqueue(E data){
        // add something to the tail/last
	Node<E> insert = new Node<E>(data);
	insert.setNext(back);
	back.getPrev().setNext(insert);
	insert.setPrev(back.getPrev());
	back.setPrev(insert);
    }

    public E dequeue(){
        // remove and return the head/front item from the stack
	Node<E> tmp = first;
	first = first.getNext();
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
	String s = "FIRST: " + first;
	for (Node<E> tmp = first.getNext(); tmp!=null; tmp=tmp.getNext()){
	    s += " --> " + tmp;
	}
	s += " FRONT: " + front + " BACK: " + back;
	return s;
    }

    
}
