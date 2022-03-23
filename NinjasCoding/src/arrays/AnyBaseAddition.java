package arrays;
import java.util.Scanner;

public class AnyBaseAddition {

	public static void main(String[] args) {
		/*
		 * You are given a base b.
			You are given two numbers n1 and n2 of base b.
			You are required to add the two numbers and print their value in base b.
		 */
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		int res = anyBaseAddition(b, n1, n2);
		System.out.println(res);

	}
	public static int anyBaseAddition(int b,int n1, int n2) {
		int res =0,carry=0,value=0,counter=0;
		while(n1>0||n2>0||carry>0) {
			int rem1 = n1%10;
			int rem2 = n2%10;
			
			n1 /=10;
			n2 /=10;
			
			int sum = rem1+rem2+carry; // sum of last two digits and carry    
			
			carry=sum/b;
			value = sum%b;			
			
			res +=value*Math.pow(10, counter);
			counter++;
		}
		
		
		return res;
		
	}

}
