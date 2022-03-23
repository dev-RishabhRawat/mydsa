package arrays;

public class SuffixSum {
	public static void fillSuffixSum(int[] arr,int n,int[] suffixSum) {
		suffixSum[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			suffixSum[i] = suffixSum[i+1]+arr[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3,4,-1,2,5 };
        int n = arr.length;
        int suffixSum[] = new int[n];
 
        fillSuffixSum(arr, n, suffixSum);
 
        for (int i = 0; i < n; i++)
            System.out.print(suffixSum[i] + " ");
        System.out.println("");
	}

}
