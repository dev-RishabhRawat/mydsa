package arrays;

public class BinarySearch {
	public static int binarySearch(int[] arr,int d) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(d>arr[mid]) {
				start = mid+1;
			}else if(d<arr[mid]) {
				end = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
