public class Node<E>{
    private int x,y;
    private Node prev;
    private int priority;

    public Node(int x, int y){
        this.x = x;
	this.y = y;
	prev = null;
	priority = 0;
    }

    public int getX(){
	return x;
    }
    public int getY(){
	return y;
    }
    public void setPrev(Node n) {
	prev = n;
    }
    public Node getPrev() {
	return prev;
    }
    public void setPrio(int n) {
	priority = n;
    }
    public Node getPrio() {
	return priority;
    }
}
