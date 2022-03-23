package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesToEnd {
	public static int[] pushZerosAtEnd(ArrayList<Integer> arr)
	{
		int[] temp = new int[arr.size()];
		int k=0;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)!=0) {
				temp[k++] = arr.get(i);
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
		int[] res = pushZerosAtEnd(arr);
		System.out.println(Arrays.toString(res));
		
	}

}
