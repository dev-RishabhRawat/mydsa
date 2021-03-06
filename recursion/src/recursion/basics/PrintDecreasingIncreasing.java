package recursion.basics;

public class PrintDecreasingIncreasing {
	
	public static void pDI(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		pDI(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}
	
	public static int fib(int n) {
		if(n==0 || n == 1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	
	public static int power(int x, int n) {
		if(n==1) {
			return x;
		}
		return x*power(x,n-1);
	}
	
	public static int search(int[] arr,int i,int t) {
		if(i>=arr.length) {
			return -1;
		}
		
		if(arr[i]==t) {
			return i;
		}
		
		return search(arr,i+1,t);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pDI(5);
//		System.out.println(fib(5));
//		System.out.println(power(2,5));
		int[] arr = {1,2,3,4,5,6};
		System.out.println(search(arr,0,10));
	}

}
