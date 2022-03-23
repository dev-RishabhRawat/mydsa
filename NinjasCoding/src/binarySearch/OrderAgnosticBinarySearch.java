package binarySearch;
// used when you don't know array is sorted in ascending or descending order.
// since elements are in dscending order when target is greater than middle element end = mid-1 if target < mid => start = mid+1;
// to check numbers are increasing order or decreasing order check first and last element s_element < end_element?"ascending":"descending"; 
public class OrderAgnosticBinarySearch {
	public static int orderAgnosticBinarySearch(int[] arr, int k) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == k) return mid;
			if(arr[start]>arr[end]) {
				if(k>arr[mid]) {
					end = mid-1;
				}else if(k<arr[mid]) {
					start = mid + 1;
				}
			}else {
				if(k>arr[mid]) {
					start = mid + 1;				
				}else if(k<arr[mid]) {
					end = mid-1;
				}
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {89,76,67,53,40,3,2,1};
		int[] arr2 = {1,2,5,6,29,30,52,86};
		System.out.println(orderAgnosticBinarySearch(arr, 40));
		System.out.println(orderAgnosticBinarySearch(arr2, 30));
		
	}

}
