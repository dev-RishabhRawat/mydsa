package ExceptionHandling.code1;

public class MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] arr = {1,23,0,56,23};
			int a,b,division;
			a = arr[3];
			b = arr[2];
			
			division = a/b;
			System.out.println(division);
			System.out.println(arr[7]);
			
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception 10" + e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out of Bound " + e);
		}
		finally {
			System.out.println("Code is Closing now bye!");
		}

	}

}
