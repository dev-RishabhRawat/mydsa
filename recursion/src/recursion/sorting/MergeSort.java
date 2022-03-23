package recursion.sorting;

import java.util.Arrays;

public class MergeSort {
	public static int[] mergeSort(int[] arr) {
		if(arr.length==1) return arr;
		int mid = arr.length/2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left,right);		
	}
	public static int[] merge(int[] first, int[] second) {
		int[] merge = new int[first.length+second.length];
		int i=0,j=0,k=0;
		while(i<first.length&&j<second.length) {
			if(second[j]<first[i]) {
				merge[k++] = second[j];
				j++;
			}else {
				merge[k++] = first[i];
				i++;
			}
		}
		if(i<first.length) {
			merge[k]=first[i];
			i++;
			k++;
		}
		if(j<second.length) {
			merge[k]=second[j];
			j++;
			k++;
		}
		return merge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		int[] res = mergeSort(arr);
		System.out.println(Arrays.toString(res));

	}

}
