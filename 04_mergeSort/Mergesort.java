import java.util.*;

public class Mergesort {
    private ArrayList<Integer> deck = new ArrayList<Integer>();

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
    /*
      a and b are ArrayLists that are alread sorted from low to high.
      They could be empty

      build and return a sorted ArrayList using the merge technique we
      discussed in class
    */
	ArrayList<Integer> output = new ArrayList<Integer>();
	//use a while loop so we can use i in the next part
	for (int i = 0; i < a.size() && i < b.size(); i++) {
	    if (a.get(i) < b.get(i)) {
		output.add(a.get(i));
	    } else {
		output.add(b.get(i));
	    }
	}
	if (a.size() >= b.size()) {
	    
	} else {
	    for 
	}
    }


    public static void main(String args[]) {
	Mergesort m = new Mergesort();
    }
    
}
