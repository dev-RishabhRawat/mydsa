package cpa27feb2;

import java.util.Scanner;

public class MyClass {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.print(checkEvenOddDigitSum(n));
}

	public static boolean checkEvenOddDigitSum(int n) {
		String s = n+"";
		int evenSum = 0;
		int oddSum = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(i%2==0) {
				int a = ch-'0';
				evenSum += a;
			}else {
				int b = ch-'0';
				oddSum += b;
			}
		}
		if(evenSum == oddSum) {
			return true;
		}else {
			return false;
		}
	}
}
