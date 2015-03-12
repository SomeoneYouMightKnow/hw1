public class Selection {

    public int select( int k, int[] A, int si, int ei ){
	//Find the kth lowest element of list L, between startindex and endindex
	int pivot = A[si]; //select an arbitrary value to pivot values around
	int pi = si;
	int l = si;
	int h = ei-1;
	int temp;

	temp = A[pi];
	A[pi] = A[ei];
	A[ei] = temp;
	
        while (l < h){
            if (A[l] < pivot) {
                l++;
            } else {
		temp = A[l];
                A[l] = A[h];
                A[h] = temp;
		h--;
            }
        }

	if (A[l] > pivot) {
	    temp = A[l];
	    A[l] = A[pi];
	    A[pi] = temp;
	} else {
	    temp = A[l+1];
	    A[l+1] = A[pi];
	    A[pi] = temp;
	}

	if (k == pi) {
	    return A[k];
	} else if (k < l) {
	    select(k, A, l, pi-1);
	} else {
	    select(k, A, pi+1, h);
	}
	return A[k];
    }
    
    
    public static void main(String[] args){
        Selection s = new Selection();
	int[] a = new int[]{4, 6, 2, 7, 1, 8, 3, 10, 9, 11, 5};


	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
	System.out.println();
	
        System.out.println(s.select(3, a, 0, a.length-1));

	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
	System.out.println();
	
    }
    
}
