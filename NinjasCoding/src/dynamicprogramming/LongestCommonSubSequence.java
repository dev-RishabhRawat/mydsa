package dynamicprogramming;

public class LongestCommonSubSequence {
	
	// finding lcs only using recursion
	public static int lcs(String s1, String s2,int i,int j) {
		if(i == s1.length() || j == s2.length()) {
			return 0;
		}
		char c1 = s1.charAt(i);
		char c2 = s2.charAt(j);
		int ans;
		if(c1 == c2) {
			ans = 1 + lcs(s1,s2,i+1,j+1);
		}else {
			int a1 = lcs(s1,s2,i+1,j);
			int a2 = lcs(s1,s2,i,j+1);
			ans = Math.max(a1, a2);
		}
		return ans;		
	}
	
	// finding lcs only using dp
		public static int lcsDp(String s1, String s2,int i,int j,int[][] dp) {
			if(i == s1.length() || j == s2.length()) {
				return 0;
			}
			// will take first character of each string.
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(j);
			int ans;
			if(c1 == c2) {
				int smallAns;
				if(dp[i+1][j+1] == -1) {
					smallAns = lcsDp(s1,s2,i+1,j+1,dp);
					dp[i+1][j+1] = smallAns;
				}else {
					smallAns = dp[i+1][j+1];
				}
				// if both characters are same then definetly that character gonna part of out subsequence so 
				// we add 1 to this ans
				ans = 1 + smallAns;
				
			}else {
				// if both the character are not equal then there is two cases
				// we exclude first character from first string and take second as whole
				// or we  exclude one char from second and take whole first string
				// rest calculation will recursion do for us
				int a1,a2;
				
				if(dp[i+1][j] == -1) {
					a1= lcsDp(s1,s2,i+1,j,dp);
					dp[i+1][j] = a1;
				}else {
					a1 = dp[i+1][j];
				}
				
				if(dp[i][j+1] == -1) {
					a2 = lcsDp(s1,s2,i,j+1,dp);
					dp[i][j+1] = a2;
				}else {
					a2 = dp[i][j+1];
				}
				
				ans = Math.max(a1, a2);
			}
			return ans;		
		}
		
		
		// finding lcs only using dp
		public static int printLcsDp(String s1, String s2,int i,int j,int[][] dp,String p) {
					if(i == s1.length() || j == s2.length()) {
						return 0;
					}
					// will take first character of each string.
					char c1 = s1.charAt(i);
					char c2 = s2.charAt(j);
					int ans;
					if(c1 == c2) {
						int smallAns;
						if(dp[i+1][j+1] == -1) {
							smallAns = printLcsDp(s1,s2,i+1,j+1,dp,p+c1);
							dp[i+1][j+1] = smallAns;
						}else {
							smallAns = dp[i+1][j+1];
						}
						// if both characters are same then definetly that character gonna part of out subsequence so 
						// we add 1 to this ans
						ans = 1 + smallAns;
						
					}else {
						// if both the character are not equal then there is two cases
						// we exclude first character from first string and take second as whole
						// or we  exclude one char from second and take whole first string
						// rest calculation will recursion do for us
						int a1,a2;
						
						if(dp[i+1][j] == -1) {
							a1= printLcsDp(s1,s2,i+1,j,dp,p);
							dp[i+1][j] = a1;
						}else {
							a1 = dp[i+1][j];
						}
						
						if(dp[i][j+1] == -1) {
							a2 = printLcsDp(s1,s2,i,j+1,dp,p);
							dp[i][j+1] = a2;
						}else {
							a2 = dp[i][j+1];
						}
						
						ans = Math.max(a1, a2);
					}
					return ans;		
				}	
		
	
		
		// finding lcs using iteration
	public static int lcsItr(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = 0;
			}
		}
		
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				int ans;
				if(s1.charAt(i) == s2.charAt(j)) {
					ans = 1 + dp[i+1][j+1];
				}else {
					int ans1 = dp[i+1][j];
					int ans2 = dp[i][j+1];
					ans = Math.max(ans1, ans2);
				}
				dp[i][j] = ans;
			}
		}
		
		return dp[0][0];		
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "bedgmc";
		String s2 = "abdfglc";
//		System.out.println(lcs(s1,s2,0,0));
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<s1.length()+1;i++) {
			for(int j=0;j<s2.length()+1;j++) {
				dp[i][j] = -1;
			}
		}
		
//		int res = lcsDp(s1,s2,0,0,dp);
//		System.out.println(res);
		
		int res = lcsItr(s1,s2);
		System.out.println(res);
	}

}
