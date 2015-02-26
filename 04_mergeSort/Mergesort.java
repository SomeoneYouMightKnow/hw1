import java.util.*;
import java.io.*;

public class Mergesort {
    
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
    /*
      a and b are ArrayLists that are alread sorted from low to high.
      They could be empty

      build and return a sorted ArrayList using the merge technique we
      discussed in class
    */
	ArrayList<Integer> output = new ArrayList<Integer>();
	while (a.size()>0 && b.size()>0) {
	    if (a.get(0) < b.get(0)) {
		output.add(a.remove(0));
	    } else {
		output.add(b.remove(0));
	    }
	}
	while (a.size()>0) {
	    output.add(a.remove(0));
	}
	while (b.size()>0) {
	    output.add(b.remove(0));
	}
        return output;
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> a) {
	//a can be unsorted;
	ArrayList<Integer> output, r1, r2;
	r1 = new ArrayList<Integer>();
	r2 = new ArrayList<Integer>();
	for (int i = 0; i < a.size(); i++) {
	    if (i<a.size()/2){
		r1.add(a.get(i));
	    } else {
		r2.add(a.get(i));
	    }
	}
	
	merge(r1,r2);
	
	return output;
    }

    public int[] mergeArray( int[] a, int[] b) {
	int[] output = new int[10];
	
	return output;
    }

    public static void main(String args[]) {
	Mergesort m = new Mergesort();
	ArrayList<Integer> c, d, e;
	c = new ArrayList<Integer>();
	d = new ArrayList<Integer>();
	e = new ArrayList<Integer>();
	Random r = new Random();
	for(int i = 1 ; i < 10 ; i++){
	    c.add(i);
	    d.add(2*i+1);
	    e.add(r.nextInt());
	}
	
	System.out.println("c: "+c);
	System.out.println("d: "+d);
	System.out.println("m: "+m.merge(c,d));
	System.out.println();
	System.out.println("e: "+e);
	System.out.println("m: "+m.mergeSort(e));
       
    }
    
}
