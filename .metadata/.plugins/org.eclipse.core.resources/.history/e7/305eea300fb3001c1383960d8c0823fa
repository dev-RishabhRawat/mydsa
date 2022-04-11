package dynamicprogramming;

import java.util.Arrays;

public class MinSquareToN {

	
	public static void main(String[] args) {
		int n = 10;
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		int res = getMinSqr(n,dp);
		System.out.println(res);
	}

	private static int getMinSqr(int n,int[] dp) {
		if(n==0){
			return 0;
		}
		int myAns = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int curAns;
			if(dp[n-(i*i)]==-1) {
				curAns = getMinSqr(n-(i*i),dp);
				dp[n-i*i] = curAns;
			}else {
				curAns = dp[n-(i*i)];
			}
			myAns = Math.min(myAns, curAns);
		}	
		return myAns+1;
	}
	

}
