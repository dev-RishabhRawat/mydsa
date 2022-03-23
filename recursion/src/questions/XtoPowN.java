package questions;

public class XtoPowN {
	public static int findXraiseToN(int a, int b) {
		if(b==1) {
			return a;
		}
		return a*findXraiseToN(a,b-1);
	}
	public static void main(String[] args) {
		int x = 5;
		int n = 3;
		int res = findXraiseToN(x,n);
		System.out.println(res);
	}
}
