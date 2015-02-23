import java.io.*;
import java.util.*;

public class Makelake {
    private int[][] field;
    private int rows;
    private int cols;
    private int elevation;
    private int N;
    
    public Makelake() {
	Scanner sc = null;
	try {
	    sc = new Scanner(new File(makelake.in));
	} catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}
	rows = sc.nextInt();
	cols = sc.nextint();
	elevation = sc.nextInt();
	N = sc.nextInt();
	for (int r = 0; r < rows; r++){
	    for (int c = 0; c < cols; c++){
		field[r][c] = sc.nextInt();
	    }
	}
    }

    public static void main(String args[]){
	Makelake l = new Makelake();
    }
}
