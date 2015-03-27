public class Driver {
    public static void main(String[] args){
	myQueue<Integer> s = new myQueue<Integer>();
	System.out.println(s);
	System.out.println(s.empty());
	for (int n = 0; n < 10; n++){
	    s.enqueue(n);
	    System.out.println(s);
	}
	System.out.println(s.empty());
	while (!s.empty()){
	    System.out.println(s.dequeue());
	    System.out.println(s);
	}
	System.out.println(s.empty());
    }
}
