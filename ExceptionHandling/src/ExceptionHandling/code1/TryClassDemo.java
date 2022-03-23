package ExceptionHandling.code1;
import java.util.*;
public class TryClassDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int a,b,division;
			a = sc.nextInt();
			b = sc.nextInt();
			sc.close();
			division = a/b;
			System.out.println(division);
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception 10" + e);
		}finally {
			System.out.println("Code is Closing now bye!");
		}
		
	}

}
