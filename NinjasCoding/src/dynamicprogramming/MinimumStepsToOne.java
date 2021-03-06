package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumStepsToOne {

	
	public static int helper(int[] dp,int n){
        if(n==1){
            return 0;
        }
        int ans1 = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;
        int ans3 = Integer.MAX_VALUE;
        if(dp[n-1]==-1){
            ans1 = helper(dp,n-1);
            dp[n-1] = ans1;
        }else{
            ans1 = dp[n-1];
        }
        if(n%2==0){
            if(dp[n/2] == -1){
                ans2 = helper(dp,n/2);
                dp[n/2] = ans2;
            }else{
                ans2 = dp[n/2];
            }
        }
        
         if(n%3==0){
            if(dp[n/3] == -1){
                ans3 = helper(dp,n/3);
                dp[n/3] = ans3;
            }else{
                ans3 = dp[n/3];
            }
        }      
         System.out.println(ans1+" \t "+ans2 +"\t"+ans3);
         int min = Math.min(ans1, Math.min(ans2,ans3)) + 1;
         return min;
     }
	
	/*
	  Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1. You can perform any one of the following 3 steps:
	1.) Subtract 1 from it. (n = n - ?1) ,
	2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
	3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).  
	 
	 */
    public static int countStepsToOne(int n) {
    	
//    	since it is recursive problem and function call is repeating
    	// eg n = 5   fn(5-1) => fn(4)  , fn(4-1) = fn(3), fn(3-1)=fn(2), fn(2-1)=fn(1)
    	// 4%2 == 0, fn(4/2) => fn(2) // this value is already captured before so we don't need this to
    	// calculate again and again so to store value of fn(2) we need a dp array.
    	// similarly when it reduce to 3 we need again fn(3) coz it is divisible by 3 
    	// so we will use value of fn(3) stored in dp.
    	
    	// for 10 values we need to store values of 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10
    	// so for n values we should have dp size of n+1;
    	
		int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(dp,n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res = countStepsToOne(n);
		System.out.println(res);
		sc.close();
	}

}
