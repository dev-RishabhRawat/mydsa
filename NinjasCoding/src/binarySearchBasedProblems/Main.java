package binarySearchBasedProblems;

public class Main {
 public static void main(String[] args) {
	int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
//	int ans = CeilingOfANumber.ceilingNumber(arr, 15);
	int ans = InfiniteArray.getPostionOfAnElement(arr, 10);
	System.out.println(ans);
}
}
