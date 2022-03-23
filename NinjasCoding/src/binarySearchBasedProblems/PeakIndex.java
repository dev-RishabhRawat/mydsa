package binarySearchBasedProblems;

public class PeakIndex {
	public static int getPeakElementIndex(int[] arr) {
		int start = 0;
		int end = arr.length;
		while(start < end) {
			int mid = start = (end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,10,8,7,5,3,1};
		int res = getPeakElementIndex(nums);
		System.out.println(res);

	}
	

}
