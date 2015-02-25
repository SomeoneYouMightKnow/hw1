import java.io.*;
import java.util.*;

public class Makelake {
    private int[][] field;
    private int rows;
    private int cols;
    private int elevation;
    private int N;
    private Scanner sc = null;
    
    public Makelake() {
	try {
	    sc = new Scanner(new File("makelake.in"));
	} catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}
	rows = sc.nextInt();
	cols = sc.nextInt();
	elevation = sc.nextInt();
	N = sc.nextInt();
	field = new int[rows][cols];
	for (int r = 0; r < rows; r++){
	    for (int c = 0; c < cols; c++){
		field[r][c] = sc.nextInt();
		//System.out.println(sc.nextInt());
	    }
	    // System.out.println();
	}
    }

    public  String toString() {
	String s = "";
	for (int i = 0; i < field.length; i++) {
	    for (int j = 0; j < field[0].length; j++ ) {
		s = s + " " + field[i][j];
	    }
	    s = s + "\n";
	}

	return s;
    }

    public void stomp(int R_s, int C_s, int D_s) {
	int max = 0;
	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		if (field[R_s+i-1][C_s+j-1]>max) {
		    max = field[R_s+i-1][C_s+j-1];
		}
	    }
	}
	//change the max value, avoid putting the above for loops inside of this one
	for (int n = 0; n < D_s; n++) {
	    for (int i = 0; i < 3; i++){
		for (int j = 0; j < 3; j++){
		    if (field[R_s+i-1][C_s+j-1]==max) {
			field[R_s+i-1][C_s+j-1]--;
		    }
		}
	    }
	}
	    /*
	if (D_s > 0) {
	    D_s--;
	    stomp( R_s, C_s, D_s );
	}
	    */
    }
    
    public static void main(String args[]){
	Makelake l = new Makelake();
        System.out.print(l);
	l.stomp(1,4,4);
	System.out.println();
	System.out.print(l);
    }
}
