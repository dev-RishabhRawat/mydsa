package sorting;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,0,2,1,3};
 
//		Sorting.selectionSort(arr);
//		Sorting.bubbleSort(arr);
//		Sorting.insertionSort(arr);  
//		Sorting.cyclicSort(arr);
		Sorting.mergeSort(arr, 0, arr.length);
		
		
        for (int i = 0; i < arr.length; i++)
        	System.out.print(arr[i] + " ");
	}
}
