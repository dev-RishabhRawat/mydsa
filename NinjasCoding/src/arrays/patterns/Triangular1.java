package arrays.patterns;

public class Triangular1 {
	public static void triangular1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println( );
		}
	}
}


/*
1 
1 2 
1 2 3 
1 2 3 4 
*/