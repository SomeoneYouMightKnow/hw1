public class MinHeap {
    private int[] heap;  //contains nonzero ints
    private int last;    //contains index of last value
    
    public Heap() {
	this(7); //default 3 levels
    }

    public Heap( int n ) {
	heap = new int[n];
	last = 0;
    }

    public int minValue() {
	return heap[0];
    }

    public int removeMin() {
	int remove = minValue();	
	heap[0] = heap[last];
	heap[last] = 0;
	last--;
	pushdown(0);
	return remove;
    }
    
    public void insert( int n ) {
	if ( heap.length == last + 1 ) {
	    
	} else {
	    last++;
	    heap[last] = n;
	    siftup(last);
	}
    }

    public void pushdown( int i ) {
	
    }

    public void siftup( int i ) {

    }

    public void sort( int i ) {

    }

    
}
