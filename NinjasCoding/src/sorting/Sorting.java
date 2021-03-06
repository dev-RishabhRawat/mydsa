package sorting;

public class Sorting {
	// method to swap two elements from array 
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// bubble sort
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
	
	// selection sort
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
	
	
	//	insertion sort
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
	
	// cyclic sort
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
	
	// merge sort
	public static void mergeSort(int[] arr, int s, int e) {
		if(s>=e) {
			return;
		}
		int mid = s + (e-s)/2;
		// part 1
		mergeSort(arr,s,mid);
		// part 2
		mergeSort(arr,mid+1,e);
		merge(arr,s,e);
	}

	public static void merge(int[] arr, int s, int e) {
		// Merging
		
		int mid = (s+e)/2;
		int[] ans = new int[e-s+1];
		int i = s;
		int j = mid+1;
		int k = 0;
		while(i<=mid && j<=e) {
			if(arr[i]<arr[j]) {
				ans[k]=arr[i];
				i++;
				k++;
				
			}else {
				ans[k] = arr[j];
				k++;
				j++;
			}
		}
		
		while(i<=mid) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while(j<=mid) {
			ans[k] = arr[j];
			j++;
			k++;
		}
	
		
		
		
		
		
		
		
	}
	
	
}
