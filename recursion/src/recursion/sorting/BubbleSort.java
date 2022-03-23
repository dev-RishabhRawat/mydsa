package recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr,int s,int e) {
		if(e==0) {
			return;
		}
		if(s<e) {
			if(arr[s]>arr[s+1]) {
				int temp = arr[s+1];
				arr[s+1] = arr[s];
				arr[s] = temp;
			}
			sort(arr,s+1,e);
		}else {
			sort(arr,0,e-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,20,15,6,9,8};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
