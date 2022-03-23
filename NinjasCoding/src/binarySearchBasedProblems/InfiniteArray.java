package binarySearchBasedProblems;


// you can imagine your array is of infinite length so you can not calculate or use arr.length 
// we can assume we can't get the size of array rest of things we will do it;  
public class InfiniteArray {
	public static int getPostionOfAnElement(int[] arr,int target) {
		 int start=0;
		 int end = 1;
		 int size=2;
		 //{1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,18}
		 while(target>arr[end]) {
			 start = end+1;
			 size +=size;
			 end+=size;
			 // end = end + (end-start+1);
		 }	 
		  
		return binarySearch(arr,start,end,target);
	}
	
	public static int binarySearch(int arr[],int start,int end,int k) {
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(k>arr[mid]) {
				start = mid +1;
			}else if(k<arr[mid]) {
				end = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
