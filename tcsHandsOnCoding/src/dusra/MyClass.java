package dusra;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean res = checkArmstrong(n);
		System.out.println(res);

	}

	private static boolean checkArmstrong(int n) {
		if(n%2!=0) {
			return false;
		}
		int num = n;
		long sum=0;
		while(num>0) {
			int rem = num%10;
			sum += rem*rem*rem;
			num/=10;
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}

}
