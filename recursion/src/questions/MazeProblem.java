package questions;

import java.util.ArrayList;

public class MazeProblem {
	public static int maze(int r, int c) {
		if(r==2 || c==2) {
			return 1;
		}
		int down = maze(r+1,c);
		int right = maze(r,c+1);
		
		int ans = down+right;
		
		
		return ans;
	}
	public static void printMazePath(String p,int r, int c) {
		if(r==2 && c==2) {
			System.out.print(p+" ");
			return;
		}
		 if(r<3 && c<3) {
			 printMazePath(p+'D',r+1,c);
			 printMazePath(p+'R',r,c+1);
		 }
		 
	
	}
	
	public static ArrayList<String> returnMazePath(String p,int r, int c) {
		if(r==2 && c==2) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		 if(r<3 && c<3) {
			 list.addAll(returnMazePath(p+'D',r+1,c));
			 list.addAll(returnMazePath(p+'R',r,c+1));
		 }
		 return list;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maze(0,0));
		printMazePath("",0,0);
		System.out.println(returnMazePath("",0,0));
	}

}
