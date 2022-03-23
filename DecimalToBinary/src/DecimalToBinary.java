/**
 * 
 */

/**
 * @author rishabh
 *
 */
public class DecimalToBinary {

	/**
	 * @param args
	 */
	public String toBinary(int n) {
		int num = n;
		String binary = "";
		while(n>0) {
			binary = n%2 + binary;
			n = n/2;
		}
		return binary;
		
	}
	public static void main(String[] args) {
		// TODO convert decimal no to binary
		DecimalToBinary obj1 = new DecimalToBinary();
		DecimalToBinary obj2 = new DecimalToBinary();
		DecimalToBinary obj3 = new DecimalToBinary();
		System.out.println(obj1.toBinary(30));
		System.out.println(obj2.toBinary(10));
		System.out.println(obj2.toBinary(5));
		
		
	}

}
