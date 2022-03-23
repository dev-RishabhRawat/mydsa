package arrays;

import java.util.ArrayList;
import java.util.Arrays;

import sorting.Sorting;



public class FindDisappearedNumber {
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		ArrayList<Integer> list = getDisappearedNumbers(arr);
		System.out.println(list);
	}

	private static ArrayList<Integer> getDisappearedNumbers(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i=1;
		while(i<arr.length) {
			int corIndex = arr[i]-1;
			if(arr[i] != arr[corIndex]) {
				Functions.swap(arr, i, corIndex);
			}else {
				i++;
			}
		}
//		Sorting.cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
		for(int j=0;j<arr.length;j++) {
			if(arr[j] !=j+1) {
				list.add(j+1);
			}
		}
		return list;
	}
}
