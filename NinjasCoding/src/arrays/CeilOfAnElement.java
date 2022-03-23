package arrays;

import java.util.Scanner;


public class CeilOfAnElement {
	public static int ceil(int[] arr, int d) {
		int start = 0;
		int end = arr.length-1;
		if(d>arr[end]) return -1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(d>arr[mid]) {
				start = mid+1;
			}else if(d<arr[mid]) {
				end = mid-1;
			}
		}
		return start;
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
		//int res = BinarySearch.binarySearch(arr, k);
		int res1 = CeilOfAnElement.ceil(arr, k);
		int res2 = FloorOfAnElement.floor(arr, k);
		if(res1!=-1) {
			System.out.println("Ceil of an element found at index : "+ res1);
		}else {
			System.out.println("No Ceil Found");
		}
		if(res2!=-1) {
			System.out.println("Floor of an element found at index : "+ res2);	
		}else {
			System.out.println("No Floor Found");
		}
	

	}
}
