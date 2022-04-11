package dynamicprogramming;
/*
Byteland has a very strange monetary system.
Each Bytelandian gold coin has an integer number written on it. A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. But these numbers 
are all rounded down (the banks have to make a profit).
You can also sell Bytelandian coins for American dollars. The exchange rate is 1:1. But you can not buy Bytelandian coins.
You have one gold coin. What is the maximum amount of American dollars you can get for it?
 Input format :
The first and the only line of input contains a the integer value of 'n'. It is the number written on your coin.
Output format :
Print the the maximum amount of American dollars you can make.
Constraints :
0 <= n <= 10 ^ 9

Time Limit: 1 sec
Sample Input 1 :
12
Sample Output 1 :
13
Explanation of Sample Output 1 :
 You can change 12 into 6, 4 and 3, and then change these into $6 + $4 + $3 = $13.
Sample Input 2 :
2
Sample Output 1 :
2
Explanation of Sample Output 2 :
If you try changing the coin 2 into 3 smaller coins, you will get 1, 0 and 0, and later you can get no more than $1 out of them.
 It is better just to change the 2 coin directly into $2.
*/
public class ByteLand {

	public static int exchangeCoin(int n) {
		if(n==0) {
			return 0;
		}
		int ans = Integer.MIN_VALUE;
		if(n>0) {
			int curAns = exchangeCoin(n/2)+exchangeCoin(n/3)+exchangeCoin(n/4);
			ans = Math.max(n, curAns);
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		
		int n = 2;
		int res = exchangeCoin(n);
		System.out.println(res);
	}

}
