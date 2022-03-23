package arrays.patterns;

public class PrintNoFromBack {
	public static void printFromBack(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}


/*
4 3 2 1 
4 3 2 1 
4 3 2 1 
4 3 2 1 
*/