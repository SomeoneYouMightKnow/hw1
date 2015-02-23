import java.io.*;
import java.util.*;

public class Knight{
    private int[][] board;
    private int maxX = 5;
    private int maxY = 5;

    private int step = 1;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Knight(){
	board = new int[maxX][maxY];
	for (int i = 0 ; i < maxX ; i++) {
	    for (int j = 0; j < maxY ; j++) {
		board[i][j] = 0;
	    }
	}
    }
		
    public String toString(){
	String s = "";
	for ( int y = 0 ; y < maxY ; y++ ){
	    for ( int x = 0 ; x < maxX ; x++ ){
	        s += String.format("%3d", board[y][x]);
	    }
	    s += "\n";
	}
	return s;
    }

    
    public void solve(int x, int y){
	if ( x >= maxX || x < 0 ||
	     y >= maxY || y < 0 ||
	     board[x][y] != 0
	     ){
	    return;
	}

	delay(100);
	System.out.println(this);
	board[x][y]=step;
	step++;
	solve(x+1,y+2);
	solve(x+1,y-2);
	solve(x-1,y+2);
	solve(x-1,y-2);
	solve(x+2,y+1);
	solve(x+2,y-1);
	solve(x-2,y+1);
	solve(x-2,y-1);
    }
		
    public static void main(String[] args){
	Knight k = new Knight();
	System.out.print(k);
	k.solve(1,1);
	System.out.print(k);
    }
}

