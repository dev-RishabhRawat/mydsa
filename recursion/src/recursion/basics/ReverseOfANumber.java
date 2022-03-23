package recursion.basics;

import java.util.ArrayList;

public class ReverseOfANumber {

	public static int reverse1(int n) {
		if(n%10==n) {
			System.out.print(n%10);
			return n;
		}
		System.out.print(n%10);
		return reverse1(n/10);
	}
	public static int reverse2(int n) {
		int digits = (int)Math.log10(n)+1;
		return helper(n,digits);
	}
	public static int helper(int n,int digits) {
		if(n%10==n) return n;
		int rem = n%10;
		return rem*((int)Math.pow(10, digits-1)) + helper(n/10,digits-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 52134;
		System.out.println(reverse2(n));
	}

}
