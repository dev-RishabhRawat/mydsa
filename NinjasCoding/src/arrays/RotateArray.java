package arrays;

import java.util.Scanner;




public class RotateArray {
	public static void rotateArray(int[] arr, int k) {
		k = k%arr.length;
		if(k<0) {
			k = k + arr.length;
		}
		
		// 1 2 3 4 5  k = 2
		// 5 4 1 2 3 output
		// Divide original array in two parts reveres each part then reverse whole part
		//  1 2 3 | 4 5  ===>>  3 2 1 | 5 4 =>  3 2 1 5 4  now reveres whole
		// 4 5 1 2 3 // that we want as output
		ReverseArray.reverseArray(arr,0,arr.length-k-1);
		ReverseArray.reverseArray(arr, arr.length-k, arr.length-1);
		ReverseArray.reverseArray(arr);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		sc.close();
		Display.displayArray(arr);
		rotateArray(arr,k);
		Display.displayArray(arr);

	}

}
