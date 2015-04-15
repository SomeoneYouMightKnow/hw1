import java.util.*;

public class Frontier<E>{
    //public LinkedList<Node> l = new LinkedList<Node>();
    public ArrayList<Node> l = new ArrayList<Node>();
    
    public void add(int i, Node n) {
	l.add(i,n);
    }

    public Node remove() {
        return l.remove(0);
    }

    public boolean isEmpty() {
	return l.isEmpty();
    }

}
