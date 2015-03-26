public class Driver {
    
    public static void main(String[] args) {
	myStack<Integer> s = new myStack();
	System.out.println(s.empty());
	for (int n = 0; n < 10; n++){
	    s.push(n);
	    System.out.println(s);
	}
	while (!s.empty()){
	    System.out.println(s.pop());
	    System.out.println(s);
	}
	System.out.println(s.empty());

    }

}