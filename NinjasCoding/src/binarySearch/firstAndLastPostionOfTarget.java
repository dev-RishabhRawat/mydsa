package binarySearch;

import java.util.Arrays;

public class firstAndLastPostionOfTarget {
	public static int[] getFirstAndLastPostionOfTarget(int[] arr,int target) {
		int[] ans = {-1,-1};
		// check for first occurrence if target first 
		ans[0] = search(arr,target,true);
		if(ans[0]!=-1) {
			ans[1] = search(arr,target,false);
		}
		return ans;
	}
	public static int search(int[] arr,int target, boolean searchingFirst) {
		int ans = -1;
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			int midleValue = arr[mid];
			if(target<midleValue) {
				end = mid-1;
			}else if(target>midleValue) {
				start = mid + 1;
			}else {
				//Potential ans is found
				ans = mid;
				if(searchingFirst) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,7,7,8,8,10};
		int target = 11;
		int[] res = getFirstAndLastPostionOfTarget(arr,target);
		System.out.println(Arrays.toString(res));

	}

}
