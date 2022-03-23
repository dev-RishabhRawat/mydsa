package arrays;
public class Display {
	public static void displayArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			sb.append(" " + arr[i]+ " ");
		}
		System.out.println("[" + sb + "]");
	}
}
