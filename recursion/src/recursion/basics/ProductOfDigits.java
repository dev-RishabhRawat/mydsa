package recursion.basics;

public class ProductOfDigits {
	public static int productOfDigits(int n) {
		if(n%10==n) {
			return n;
		}
		return n%10 * productOfDigits(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3453;
		System.out.println(productOfDigits(n));

	}
}
