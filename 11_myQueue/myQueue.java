public class myQueue<E>{
    // You decide how the node(s) are declared
    Node<E> front, back;

    // make whatever constructor(s) you need
    public myQueue(E s) {
	front = new Node<E>();
	back = new Node<E>();
	front.setNext(back);
    }
	
    public void enqueue(E data){
        // add something to the tail/last
    }

    public E dequeue(){
        // remove and return the head/front item from the stack
    }

    public boolean empty(){
	
    }

    public E head() {
        // return the first item in the queue
    }
}
