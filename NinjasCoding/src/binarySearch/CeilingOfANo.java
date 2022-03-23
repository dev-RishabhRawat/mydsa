package binarySearch;
import java.util.*;
public class CeilingOfANo {
	public static int searchElement(int[] arr,int k) {
		if(k>arr[arr.length-1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;  
			if(k<arr[mid]) {
				end = mid-1;
			}else if(k>arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,9,14,16,18};
		int target = 18;
		int index = searchElement(arr, target);
		
		if(index!=-1) {
			System.out.println("Ceiling of a given Number : "+arr[index]);	
		}else {
			System.out.println("Not Found!!");
		}
	
	}

}
