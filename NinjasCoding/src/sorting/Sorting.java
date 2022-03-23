package sorting;

public class Sorting {
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void bubbleSort(int[]  arr) {
		int n = arr.length;
		boolean flag = true;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					flag = false;
					swap(arr,j,j+1);
				}
				if(flag) return;
			}
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i;j<arr.length;j++) {
				if(min>arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			swap(arr,i,minIndex);
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}else {
					break;
				}
			}
		}
	}
	
	public static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int corIndex = arr[i];
			if(arr[i] != arr[corIndex]) {
				swap(arr,i,corIndex);
			}else {
				i++; 
			}
			
		}
	}
	
	
}
