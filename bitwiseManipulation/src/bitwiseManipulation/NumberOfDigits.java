package bitwiseManipulation;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO digit of 6 in base 10 = 1, and in base 2 = 3 i.e: 110
		int n=6;
		int b = 10;
		int digits = (int)(Math.log(n)/Math.log(b)) + 1;
		System.out.println(digits);
		
	}

}
