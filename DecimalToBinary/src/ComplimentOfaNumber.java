
public class ComplimentOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 2147483647;
		System.out.println(compliment(n));

	}

	private static Long compliment(long n) {
		String b = Long.toBinaryString(n);
		while(b.length()!=32) {
			b = "0"+b;
		}
		b = b.replace("0", "x");
		b = b.replace("1", "0");
		b = b.replace("x", "1");
		return Long.parseLong(b,2);
	}

}
