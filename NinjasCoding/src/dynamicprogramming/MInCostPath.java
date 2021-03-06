package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MInCostPath {
	public static void main(String[] args) {
		
		int[][] mat = {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
		int m = mat.length;
		int n = mat[0].length;
		int[][] dp = new int[m+1][n+1];// increase 1 extra column and extra row just to store last return value that is infininte
		// or you can write conditions inside codes so that your code will not throw index out of the bound error 
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				dp[i][j] = Integer.MIN_VALUE; // because -1 can be the ans of array
			}
		}
//		ArrayList<Integer> list = findMinPath(mat,0,0,dp,0,"");
//		System.out.println(Collections.min(list));
		
//		System.out.println( findMinPath2(mat,0,0,dp,0,""));
		
//		System.out.println( findMinPath3(mat,0,0));
		
		//using dp
//		System.out.println( findMinPath4(mat,0,0,dp));
		
		//iterative version
		System.out.println( findMinPath45(mat,0,0));
		
	}

	// here we are getting the ans from iterative version
	private static int findMinPath45(int[][] mat, int r, int c) {
		int m = mat.length;
		int n = mat[0].length;
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(i==m-1 && j==n-1) {
					dp[i][j] = mat[i][j];
					continue;
				}
				int ans1 = dp[i+1][j];
				int ans2 = dp[i][j+1];
				int ans3 = dp[i+1][j+1];
				
				dp[i][j] = mat[i][j] + Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[0][0];
		
	}


	// This method will directly return minimum cost 
	private static int findMinPath2(int[][] mat, int r, int c, int[] dp,int ctr,String p) {
		if(r == mat.length-1 && c == mat[0].length-1) {
			ctr = ctr + mat[r][c];
//			System.out.println(p);
			return ctr;
		}
		int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
		
		if(r<mat.length-1) {
			ans1 = findMinPath2(mat,r+1,c,dp,ctr+mat[r][c] ,p+'R');
		}
		if(c<mat[0].length-1) {
			ans2 = findMinPath2(mat,r,c+1,dp,ctr+mat[r][c] ,p+'D');
		}
		if(r<mat.length-1 && c<mat[0].length-1) {
			ans3 = findMinPath2(mat,r+1,c+1,dp,ctr+mat[r][c] ,p+'G');
		}
		int ans = Math.min(ans1, Math.min(ans2, ans3));
		return ans;
		
		
	}

	// method one without using dp by using list 
		private static ArrayList<Integer> findMinPath(int[][] mat, int r, int c, int[] dp,int ctr,String p) {
			if(r == mat.length-1 && c == mat[0].length-1) {
				ctr = ctr + mat[r][c];
				System.out.println(p);
				ArrayList<Integer> list = new ArrayList<>();
				list.add(ctr);
				return list;
			}
			ArrayList<Integer> list = new ArrayList<>();
			
			if(r<mat.length-1) {
				list.addAll(findMinPath(mat,r+1,c,dp,ctr+mat[r][c] ,p+'R'));
			}
			if(c<mat[0].length-1) {
				list.addAll(findMinPath(mat,r,c+1,dp,ctr+mat[r][c] ,p+'D'));
			}
			if(r<mat.length-1 && c<mat[0].length-1) {
				list.addAll(findMinPath(mat,r+1,c+1,dp,ctr+mat[r][c] ,p+'G'));
			}
			
			return list;
			
			
		}
		
		// This method 3 will directly return minimum cost 
		private static int findMinPath3(int[][] mat, int r, int c) {
			int m = mat.length;
			int n = mat[0].length;
			// when your at (r-1,c-1) index 
			if(r == m-1 && c == n-1) {
				return mat[r][c];
			}
			
			// base case
			if(r>=m || c>=n) {
				return Integer.MAX_VALUE;
			}
			
			
			int ans1 = findMinPath3(mat, r+1, c);
			int ans2 = findMinPath3(mat, r, c+1);
			int ans3 = findMinPath3(mat, r+1, c+1);
		
			int myAns = mat[r][c] +  Math.min(ans1, Math.min(ans2, ans3));
			
			return myAns;
			
			
		}

		// This method 3 will directly return minimum cost using dp 
		private static int findMinPath4(int[][] mat, int r, int c,int[][] dp) {
					int m = mat.length;
					int n = mat[0].length;
					// when your at (r-1,c-1) index 
					if(r == m-1 && c == n-1) {
						return mat[r][c];
					}
					
					// base case
					if(r>=m || c>=n) {
						return Integer.MAX_VALUE;
					}
					int ans1,ans2,ans3;
					if(dp[r+1][c] == Integer.MIN_VALUE) {
						ans1 = findMinPath4(mat, r+1, c,dp);
						dp[r+1][c] = ans1;
					}else {
						ans1 = dp[r+1][c];
					}
					
					if(dp[r][c+1] == Integer.MIN_VALUE) {
						ans2 = findMinPath4(mat, r, c+1,dp);
						dp[r][c+1] = ans2;
					}else {
						ans2 = dp[r][c+1];
					}
					
					if(dp[r+1][c+1] == Integer.MIN_VALUE) {
						ans3 = findMinPath4(mat, r+1, c+1,dp);
						dp[r+1][c+1] = ans3;
					}else {
						ans3 = dp[r+1][c+1];
					}
			
				
					int myAns = mat[r][c] +  Math.min(ans1, Math.min(ans2, ans3));
					
					return myAns;
					
					
				}
}
