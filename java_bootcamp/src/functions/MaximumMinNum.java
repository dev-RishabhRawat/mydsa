package functions;

import java.util.Scanner;

public class MaximumMinNum {

	public static void main(String[] args) {
		// TODO Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers \n----------->");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(maxNumber(a,b,c) + " Is Largest Number");
		System.out.println(minNumber(a,b,c) + " Is Largest Number");
		
	}
	
	public static int maxNumber(int num1, int num2, int num3) {
		int max=0;
		if(num1>num2 && num1>num3) {
			max=num1;
		}else if(num2>num1 && num2>num3){
			max=num2;
		}else {
			max=num3;
		}		
		return max;
	}

	public static int minNumber(int num1, int num2, int num3) {
		int min=0;
		if(num1<num2 && num1<num3) {
			min=num1;
		}else if(num2<num1 && num2<num3){
			min=num2;
		}else {
			min=num3;
		}		
		return min;
	}
}
