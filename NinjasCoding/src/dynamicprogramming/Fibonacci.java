package dynamicprogramming;

import java.util.Scanner;

public class Fibonacci {
	
	
	public static int min(int a, int b, int c) {
		int min = Math.min(a, Math.min(b, c));
		return min;
	}
	public static int fib(int[] dp,int n) {
		if(n==0 || n == 1) {
			return n;
		}
		
		int ans1,ans2;
		if(dp[n-1] == -1) {
			ans1 = fib(dp,n-1);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		
		if(dp[n-2] == -1) {
			ans2 = fib(dp,n-2);
			dp[n-2] = ans2;
		}else {
			ans2 = dp[n-2];
		}
			
		int myAns = ans1+ans2;
		return myAns;
	}
	
	
	
	// iterative way of calculating fibonacci sequence
	
	public static int fibItr(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//	
//		int[] dp = new int[n+1];
//		for(int i=0;i<dp.length;i++) {
//			dp[i] = -1;
//		}
//		Arrays.fill(dp, -1);
//		System.out.println(fib(dp,n));
//		System.out.println(Arrays.toString(dp));
		
		System.out.println(fibItr(n));
		
		
		sc.close();
	}
}
