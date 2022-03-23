package questions;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {1,2,5,9,12,25,30};
		int num = 31;
		int n = search(arr,num);
		System.out.println(n);
	}

	public static int search(int[] arr, int num) {
		// TODO search number using recursion
		
		return helper(arr,num,0);
	}
	public static int helper(int[] arr,int num,int index) {
		if(index==arr.length-1 && arr[index]!=num) return -1;
		if(arr[index] == num) {
			return index;
		}
		return helper(arr,num,index+1);
	}
	
}
