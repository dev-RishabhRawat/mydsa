package arrays;

import java.util.Scanner;


public class ReverseArray {
	
	public static void reverseArray(int[] a) {
		int start = 0;
		int end = a.length-1;
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	public static void reverseArray(int[] a,int i, int j) { // given index starting from 0
		int start = i;
		int end = j;
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Display.displayArray(arr);
		reverseArray(arr,2,4);
		Display.displayArray(arr);

	}

}

