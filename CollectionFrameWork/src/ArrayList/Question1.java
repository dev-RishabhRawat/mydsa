package ArrayList;
// https://www.hackerrank.com/challenges/java-arraylist/problem question
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO https://www.hackerrank.com/challenges/java-arraylist/problem
		//You are given  lines. In each line there are zero or more integers.
		//You need to answer a few queries where you need to tell the number located in  position of  line.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList[] list = new ArrayList[n];
		for(int i=0;i<n;i++) {
			int d = sc.nextInt();
			list[i] = new ArrayList();
			for(int j=0;j<d;j++) {
				int element = sc.nextInt();
				list[i].add(element);
			}
		}
		int q = sc.nextInt();
		int x,y;
		for(int i=0;i<q;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			try {
				System.out.println(list[x-1].get(y-1));
			}catch(Exception e) {
				System.out.println("ERROR!");
			}
		}
	}

}
