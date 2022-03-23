package questions;

public class FindArraySortedOrNot {
	static int count =0;
	public static boolean isSorted1(int[] arr) {
		for(int i=1,j=0;i<arr.length;i++,j++) {
			if(arr[j]>arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSorted2(int[] arr) {
		return helper1(arr,0);
	}
	
	//second way
	public static boolean helper1(int[] arr, int pos) {
		count++;
		if(pos == arr.length-1) {
			return true;
		}
		if(arr[pos]>arr[pos+1]) {
			return false;
		}
		return helper1(arr,pos+1);
	}
	
	
	// third way
	public static boolean helper2(int[] arr, int pos) {
		count++;
		if(pos == arr.length-1) {
			return true;
		}
		if(arr[pos]<arr[pos+1]&&helper2(arr,pos+1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,7,8,9,12,24,15,20};
		boolean b = isSorted2(arr);
		System.out.println(b);
		System.out.println(count);

	}

}
