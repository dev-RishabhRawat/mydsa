package bitwiseManipulation;

public class FindMagicNumber {
	
	public static int findMagic(int n) {
		int num = 5;
		int ans = 0;
		while(n>0) {
			ans+= (n&1)*num;
			num = num*5;
			n = n>>1;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 6 = 1	1	0 ===> 1*5^3 + 1*5^2 + 0 = 150
		int n = 3;
		int ans = findMagic(n);
		System.out.println(ans);

	}

}
