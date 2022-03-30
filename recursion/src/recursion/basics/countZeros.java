package recursion.basics;

public class countZeros {
	public static int countZero(int n,int cnt) {
		if(n%10==n ) return cnt;
		if(n%10==0) {
			return countZero(n/10,cnt+1);
		}
		
		if(n%10!=0) {
			return countZero(n/10,cnt);	
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20304404;
		System.out.println(countZero(n,0));
	}

}
