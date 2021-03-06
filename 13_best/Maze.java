import java.util.*;
import java.io.*;

public class Maze{
    private int maxX, maxY;
    private char[][] board;
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private int ex, ey;
    private char visited = '.';
    private boolean solved = false;
    private Frontier f;

    
    public void delay(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public Maze() {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()) {
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++) {
		    if (line.charAt(i) == exit) {
			ex = i;
			ey = j;
		    }
		    board[i][j] = line.charAt(i);
		}
		j++;
	    }
	}
	catch (Exception e) {}
    }
		
    public String toString() {
	String s = "[2J\n";
	for (int y=0;y<maxY;y++) {
	    for (int x=0;x<maxX;x++) {
		s = s +board[x][y];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public void addToFront(int x, int y, Node n) {
	Node tmp = null;
	if ( board[x][y] == path || board[x][y] == exit ) {
	    tmp = new Node(x,y);
	    tmp.setPrev(n);
	    f.add(tmp);
	}
    }
    
    public void bfs(int x, int y) {
	f = new Frontier();
	//f = new StackFront();
	
	f.add(new Node(x,y));
	Node current = null;
	while (!f.isEmpty()) {
	    current = f.remove();
	    int cx = current.getX();
	    int cy = current.getY();

	    if ( board[cx][cy] == '$' ) {
		break;
	    }
	    
	    board[cx][cy] = 'z';

	    addToFront(cx+1,cy,current);
	    addToFront(cx-1,cy,current);
	    addToFront(cx,cy+1,current);
	    addToFront(cx,cy-1,current);

	    delay(50);
	    System.out.println(this);
	}

	for (Node p = current.getPrev(); p != null ; p = p.getPrev()){
	    board[p.getX()][p.getY()] = 'P';
	    delay(100);
	    System.out.println(this);
	}

    }

    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.bfs(1,1);
	System.out.println(m);
    }
}
