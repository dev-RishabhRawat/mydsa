package arrays.patterns;


public class PrintColNo {
	public static void printColNo(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

/*
1 2 3 4 
1 2 3 4 
1 2 3 4 
1 2 3 4 
*/