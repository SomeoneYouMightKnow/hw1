import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	//LList tests
	///*
	LList l = new LList();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	l.add(6);
	System.out.println(l);
	System.out.println(l.get(1));
	l.insert(3,7);
	System.out.println(l);
	l.remove(6);
	System.out.println(l);
	l.remove2(3);
	System.out.println(l);// */

	//timing
	/*
	  ArrayList<Integer> al = new ArrayList<Integer>();
	  for (int i=0;i<1000000;i++){
	  al.add(i);
	  }
	  LList ll = new LList();
	  for (int i=0;i<100000;i++){
	  ll.add(i);
	  }
	
	  long start;
	  int sum;
	  start = System.currentTimeMillis();
	  sum = 0;
	  for (int i=0;i<al.size(); i++){
	  sum = sum + al.get(i);
	  }
	  System.out.println(System.currentTimeMillis()-start);
	  //remains at around 8
	  start = System.currentTimeMillis();
	  sum = 0;
	  for (int i=0;i<ll.len; i++){
	  sum = sum + ll.get(i);
	  }
	  System.out.println(System.currentTimeMillis()-start); 
	  //107 -> 11690 as you go from 10000 to 100000 
	  */
    }
}
