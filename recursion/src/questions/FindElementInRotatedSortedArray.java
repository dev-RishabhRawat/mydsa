package questions;

public class FindElementInRotatedSortedArray {
	
	public static int search(int[] arr, int target, int s, int e) {
		if(s>e) {
			return -1;
		}
		int m = s + (e-s)/2;
		if(target == arr[m]) {
			return m;
		}
		if(arr[s]<=arr[m]) {
			if(target>=arr[s] && target<=arr[m]) {
				return search(arr,target,s,m);
			}else {
				return search(arr,target,m+1,e);
			}
		}
		if(target>=arr[m] && target<=arr[e]) {
			return search(arr,target,m,e);
		}
		
		return search(arr,target,s,m-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,7,8,9,1,2,3};
		System.out.println(search(arr,9,0,arr.length-1));
	}

}
