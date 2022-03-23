package recursion.basics;

public class BinarySearch {
	
	public static int search(int[] arr,int target,int s,int e) {
		if(s>e) return -1;
		int m = s + (e-s)/2;
		if(arr[m]==target) {
			return m;
		}
		if(arr[m]>target) {
			return search(arr,target, s, m-1);
		}
		return search( arr,target, m+1,e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,10,21,25,30,54,56,90};
		int target = 58;
		System.out.println(search(arr,target,0,arr.length-1));

	}

}
