package binarySearchBasedProblems;

public class CeilingOfANumber {
	public static int ceilingNumber(int[] arr, int k) {
		int res = 0;
		int start = 0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(k>arr[mid]) {
				start = mid + 1;
			}else if(k<arr[mid]) {
				end = mid-1;
			}
		}
		res = arr[start];
		
		return res;
	}
}
