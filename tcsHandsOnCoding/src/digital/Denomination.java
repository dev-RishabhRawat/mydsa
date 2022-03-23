package digital;

public class Denomination {

	public static void main(String[] args) {
		// TODO Read an amount and split that into 1 rupee, 10-rupee, 100-rupee, 500-rupee
//		and 2000-rupee denominations.
//		Input 12345
//		Output:6-2000 0-500 3-100 4-10 5-1
		
		int n = 12345;
		int two_k=0,five_hun=0,hun=0,ten=0,five=0;
		while(n>0) {
			if(n>=2000) {
				two_k = n/2000;
				n=n%2000;
			}else if(n>=500) {
				five_hun = n/500;
				n%=500;
			}else if(n>=100) {
				hun = n/100;
				n%=100;
			}else if(n>=10) {
				ten=n/10;
				n%=10;
			}else {
				five = n/5;
				n%=5;
			}
		}
		System.out.println("2000 :: "+two_k+" 500 :: "+ five_hun+" 100 :: " + hun+ " Ten :: "+ ten +" five :: "+five);
	}

}
