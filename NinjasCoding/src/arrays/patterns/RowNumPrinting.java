package arrays.patterns;

public class RowNumPrinting {
		public static void rowNoPrinting(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
}
/*
1 1 1 1 
2 2 2 2 
3 3 3 3 
4 4 4 4 
*/