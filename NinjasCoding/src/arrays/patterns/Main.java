package arrays.patterns;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int n = sc.nextInt();
		sc.close();
//	SquarePattern.printSquare(n);
//	RowNumPrinting.rowNoPrinting(n);
//	PrintColNo.printColNo(n);
//	PrintNoFromBack.printFromBack(n);
		Triangular1.triangular1(n);
	}
}
}
