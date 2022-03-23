package arrays;

public class FloorOfAnElement {
	public static int floor(int[] arr, int d) {
		int start = 0;
		int end = arr.length-1;
		if(d<arr[start]) return -1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(d>arr[mid]) {
				start = mid+1;
			}else if(d<arr[mid]) {
				end = mid-1;
			}
		}
		return end;
	}
}
