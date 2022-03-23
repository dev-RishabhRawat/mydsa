package digital;

import java.util.Arrays;

public class LastPosition {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int[] res = getPosition(n);
		System.out.println(Arrays.toString(res));

	}

	private static int[] getPosition(int n) {
		int x=0,y=0;
		char ch = 'R';
		int distance = 10;
		while(n>0) {			
			switch(ch){
			  case 'R':
				  x +=distance;
				  ch = 'U';
				  break;
			  case 'U':
				  y+=distance;
				  ch='L';
				  break;
			  case 'L':
				  x = x-distance;
				  ch='D';
				  break;
			  case 'D':
				  y=y-distance;
				  ch = 'A';
				  break;
			  case 'A':
				  x = x+distance;
				  ch='R';
				  break;
				  
		  }			
			n--;
			distance+=10;
		}
		int[] arr = new int[2];
		arr[0] = x;
		arr[1] = y;
		return arr;
		
	}

}
