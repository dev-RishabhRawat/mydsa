package arrays;

import java.util.Arrays;

public class FindMissingNo {
	public static int findMissingNo(int[] arr) {
		int i=0;
		System.out.println(Arrays.toString(arr));
		while(i<arr.length) {
			int corIndex = arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[corIndex]) {
				Functions.swap(arr, i, corIndex);
			}else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int index=0;index<arr.length;index++) {
			if(arr[index] != index) {
				return index;
			}
		}
		return arr.length;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,0,2,1};
		System.out.println(findMissingNo(arr));

	}

}
