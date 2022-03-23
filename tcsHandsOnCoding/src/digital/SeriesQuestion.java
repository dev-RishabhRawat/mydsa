package digital;

public class SeriesQuestion {
	
	public static void main(String[] args) {
		// TODO 1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17…..
		int n = 14;
		int res = getNthTerm(n);
		System.out.println(res);
		System.out.println(prime(7));
	}

	private static int getNthTerm(int n) {
		if(n%2==0) {
			return prime(n/2+1);
		}else {
			return fibonacci(n/2);
		}
	}

	private static int fibonacci(int n) {
		if(n<=1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

	private static int prime(int n) {
		// TODO Auto-generated method stub
		int count=-1;// because we exclude 2 in our prime list and starting from checking prime At 3
		if(n<=1) {
			return 2;
		}
		for(int i=3;i<Integer.MAX_VALUE;i++) {// iterate over all possible no's
			boolean flag=true;// we assume that ith number is prime
			for(int j=2;j<i;j++) {//condition to check a number is  prime or not 
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				++count;//
				if(count==n)
					return i;
			}
		}
		return 0;
	}

}
