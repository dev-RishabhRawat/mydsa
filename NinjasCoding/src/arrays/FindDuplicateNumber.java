package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,7,8,2,3,1};
//		System.out.println(getDuplicateNo(arr));
		System.out.println(getDuplicateList(arr));
		
	}
	public static List<Integer> getDuplicateList(int[] arr){
		int i=0;
		List<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			int corIndex = arr[i]-1;
			if(arr[i]!=arr[corIndex]) {
				Functions.swap(arr, i, corIndex);
			}else {
				i++;
			}
		}
	
	for(int j=0;j<arr.length;j++) {
		if(arr[j] != j+1) {
			list.add(arr[j]);
		}
	}
	 Collections.sort(list);
		return list;
	}
	public static int getDuplicateNo(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		//First Method
//		while(i<arr.length) {
//			int corIndex = arr[i]-1;
//			if(arr[i]!=arr[corIndex]) {
//				Functions.swap(arr, i, corIndex);
//			}else {
//				i++;
//			}
//		}
//		
//		for(int j=0;j<arr.length;j++) {
//			if(arr[j] != j+1) {
//				return arr[j];
//			}
//		}
		
		// Second Method
		while(i<arr.length) {
			if(arr[i]!=i+1) {
				int cor = arr[i]-1;
				if(arr[i]!=arr[cor]) {
					Functions.swap(arr, i, cor);
				}else {
					return arr[i];
				}
			}else {
				i++;
			}
		}
		return -1;
	}

}
