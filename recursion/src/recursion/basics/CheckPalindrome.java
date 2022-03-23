package recursion.basics;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = checkPalindrome(n);
		System.out.println("is Palindrome ? " + b);
	}
	
	public static int reverse(int n,int digits) {
		if(n%10==n) return n;
		int rem = n%10;
		return rem*((int)Math.pow(10, digits-1))+reverse(n/10,digits-1);
	}

	public static boolean checkPalindrome(int n) {
		// TODO Auto-generated method stub
		int digits = (int)Math.log10(n)+1;
		int rev = reverse(n,digits);
		System.out.println("reveresed no: "+rev);
		if(rev != n) {
			return false;
		}
		
		return true;
		
	}
}
