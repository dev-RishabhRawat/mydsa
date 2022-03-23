package binarySearch;
import java.util.Scanner;
public class BinarySearch {

	public static int searchElement(int[] arr,int k) {
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
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.close();
		int[] arr = {2,8,19,23,49,50,89};
		int k = 89;
		int res = searchElement(arr,k);
		if(res!=-1) {
			System.out.println("Searched Element Found at Index :"+res);	
		}else {
			System.out.println("Not Found!!");
		}
		
	}

}
