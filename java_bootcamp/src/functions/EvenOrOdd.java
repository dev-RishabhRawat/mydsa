package functions;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Define a program to find out whether a given number is even or odd.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number to check odd or even");
		int a = sc.nextInt();
		checkEvenOdd(a);

	}

	private static void checkEvenOdd(int a) {
		// TODO Auto-generated method stub
		int n = a;
		if(n%2==0) {
			System.out.println(n + " is Even Number");
		}else {
			System.out.println(n + " is Odd Number");
		}
	}

}
