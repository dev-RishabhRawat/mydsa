package arrays;

public class SubArrays {
	public static void subArrays(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i ; k<=j ;k++) {
					System.out.print(arr[k] + "\t");
				}
				System.out.println();
			}
		}
	}
	
	public static int countSubArrays(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		subArrays(arr);
	}
}
