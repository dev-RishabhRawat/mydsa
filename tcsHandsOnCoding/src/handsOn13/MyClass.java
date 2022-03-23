package handsOn13;
import java.util.*;
public class MyClass {
	public static boolean validateScore(double n) {
		n = (int)n;
		if(n>0 && n<=100) return true;
		
		return false;
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			double[] list = new double[n];
			for(int i=0;i<list.length;i++) {
				list[i] =sc.nextDouble();
			}
			
			double[] validScore = findValidScores(list);
			int[] arr = new int[validScore.length];
			if(validScore.length>0) {
				for(int i=0;i<validScore.length;i++) {
					arr[i] = (int)validScore[i];
				}
				System.out.println("Valid Score = "+ Arrays.toString(arr));
				
			}else {
				System.out.println("No Valid score found");
			}
		}catch(InputMismatchException e) {
			
		}
	}
	public static double[] findValidScores(double[] list) {
		int cnt = 0;
		for(int i=0;i<list.length;i++) {
			double n = list[i];
			if(validateScore(n)) cnt++;
		}
		double[] temp = new double[cnt];
		int j = 0;
		for(int i=0;i<list.length;i++) {
			double n = list[i];
			if(validateScore(n)) {
				temp[j++] = n;
			}
		}
		
		return temp;
	}

}
