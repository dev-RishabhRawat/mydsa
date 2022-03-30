package backtracking;

import java.util.Arrays;

public class BacktrackingProblems {

	public static int maze(int[][] arr,int row,int col) {
	  if(row == arr.length-1 && col == arr.length-1 ) {
		  return 1;
	  }
	  
	  int dCount = 0;
	  if(col<=arr.length-1) {
		  dCount = maze(arr,col+1,row);
	  }
	  int rCount = 0;
	  if(row<=arr.length-1) {
		  rCount = maze(arr,col,row+1);
	  }
	  return dCount + rCount;	  
	}
	
	
	// by only going right and down
	public static void printMaze(int row,int col,String p) {
		  if(row == 2 && col == 2 ) {
			  System.out.println(p);
			  return;
		  }
		  
		  if(col<=2 && row<=2) {
			  printMaze(row+1,col,p+'D');
			  printMaze(row,col+1,p+'R');
		  }
		 
		}
	
	
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int res = maze(arr,0,0);
		System.out.println(res);
		
		printMaze(0,0,"");
	}
	
	 
}
