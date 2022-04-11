package backtracking;

import java.util.ArrayList;
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
	
	
	// by  going right , down and diagonal
	
	public static ArrayList<String> printMazeDiagonally(int row,int col,String p  ) {
		  if(row == 2 && col == 2 ) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		  }
		  
		  ArrayList<String> list = new ArrayList<>();
		  
		  if(row<=2) {
			  list.addAll(printMazeDiagonally(row+1,col,p+'D'));
		  }
		  
		  if(col<=2) {
			  list.addAll(printMazeDiagonally(row,col+1,p+'R'));
		  }
		  
		  if(col<=2 && row<=2) {
			  list.addAll(printMazeDiagonally(row+1,col+1,p+'T'));
		  }
		 return list;
		}
	
	// by  going right and down only	
	public static ArrayList<String> printMaze(int row,int col,String p  ) {
		  if(row == 2 && col == 2 ) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		  }
		  
		  ArrayList<String> list = new ArrayList<>();
		  
		  if(row<2) {
			  list.addAll(printMaze(row+1,col,p+'D'));
		  }
		  
		  if(col<2) {
			  list.addAll(printMaze(row,col+1,p+'R'));
		  }
		
		 return list;
		}
	
	
	// when you have river in your path and you can't cross that river.
	public static void printMazeWithRiver(int[][] arr,int row,int col,String p  ) {
			  if(row == arr.length-1 && col == arr[0].length-1 ) {
				  System.out.println(p);
				  return;
			  }
			  
			  if(arr[row][col] != 0)
				  return;
			
			  if(row<arr.length-1) {
				  printMazeWithRiver(arr,row+1,col,p+'D');
			  }
			  
			  if(col<arr[0].length-1) {
				  printMazeWithRiver(arr,row,col+1,p+'R');
			  }
				 
			
			}
		
	
	
	// now you can go on any direction top down right left	 it uses concept of backtracking
	public static void allPath(boolean[][] maze,int row,int col,String p  ) {
		  if(row == maze.length-1 && col == maze[0].length-1 ) {
			System.out.println(p);
			return;
		  }
		  
		 
		  if(!maze[row][col]) {
			  return;
		  }
		  maze[row][col] = false; 
 		  if(row<  maze.length-1) {
			allPath(maze,row+1,col,p+'D');
		  }
		  
		  if(col< maze[0].length-1 ) {
			  allPath(maze,row,col+1,p+'R');
		  }
		  
		  if(col>0) {
			  allPath(maze,row,col-1,p+'L');
		  }
		  
		  if(row>0) {
			  allPath(maze,row-1,col,p+'T');
		  }
		
		  maze[row][col] = true;
		}
	
	
	// now you can go on any direction top down right left	, print path with matrix
		public static void allPathWithMatrix(boolean[][] maze,int[][] arr,int row,int col,String p ,int steps ) {
			  if(row == maze.length-1 && col == maze[0].length-1 ) {
				System.out.println(p);
				 arr[row][col] = steps;
				for(int i=0;i<arr.length;i++) {
					for (int j = 0; j < arr.length; j++) {
						 System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				return;
			  }
			  
			 
			  if(!maze[row][col]) {
				  return;
			  }
			  
			  maze[row][col] = false; 
			  arr[row][col] = steps;
			  
	 		  if(row<  maze.length-1) {
	 			 allPathWithMatrix(maze,arr,row+1,col,p+'D',steps+1);
			  }
			  
			  if(col< maze[0].length-1 ) {
				  allPathWithMatrix(maze,arr,row,col+1,p+'R',steps+1);
			  }
			  
			  if(col>0) {
				  allPathWithMatrix(maze,arr,row,col-1,p+'L',steps+1);
			  }
			  
			  if(row>0) {
				  allPathWithMatrix(maze,arr,row-1,col,p+'T',steps+1);
			  }
			  arr[row][col] = 0;
			  maze[row][col] = true;
			}
		
	
	public static void main(String[] args) {
		int[][] arr = { {0, 0, 0}, {0, 0, 0}, {0, 0, 0}}; 
		 
//		System.out.println("length : " + printMaze(0,0,"").size() + "\nPath : " + printMaze(0,0,"") );
		
//		printMazeWithRiver(arr,0,0,"");
		
		ArrayList<String> list = printMazeDiagonally(0,0,"");
		System.out.println(list);
		
		boolean[][] maze = {
				{true, true, true},
				{true, true, true},
				{true, true, true}
		};
//		allPathWithMatrix(maze,arr,0,0,"",0);
		
		
		
	}
	
	 
}
