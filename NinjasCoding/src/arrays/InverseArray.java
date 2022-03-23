package arrays;

import java.util.Scanner;



public class InverseArray {
	public static int[] inverseArray(int[] arr) {
		//   1 2 3 4 0   inverse => 4 0 1 2 3
		// 0 per 1  =>  1 per 0
		int temp[] = new int[arr.length];
		int value=0;
		for(int i=0;i<arr.length;i++) {
			value = arr[i];
			temp[value] = i;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO inverse an array
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Display.displayArray(arr);
		Display.displayArray(inverseArray(arr));

	}

}
