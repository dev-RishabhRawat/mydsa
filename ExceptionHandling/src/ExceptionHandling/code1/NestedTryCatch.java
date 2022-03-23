package ExceptionHandling.code1;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			int[] arr = {1,23,0,56,23};
			int a,b,division;
			a = arr[3];
			b = arr[1];
			
			division = a/b;
			System.out.println("a/b = "+ division);
			try {
				System.out.println(arr[7]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Maximum index you can get : " + (arr.length-1));
			}
			
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception 10" + e);
		}
		finally {
			System.out.println("\n\n\n\nCode is Closing now bye!");
		}

	}

}
