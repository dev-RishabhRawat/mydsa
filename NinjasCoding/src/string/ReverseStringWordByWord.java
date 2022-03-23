package string;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		// TODO reverse word by word with multiple spaces
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = "";
		int i = str.length()-1;
		while(i>=0) {
			if(i<0) break;
			while(i>=0 && str.charAt(i) == ' ') i--;
			int j = i;
			while(i>=0 && str.charAt(i) != ' ') i--;
			if(ans.isEmpty()) {
				ans = ans.concat(str.substring(i+1,j+1));
			}else {
				ans = ans.concat(" "+str.substring(i+1,j+1));
			}
			
		}
		System.out.println(ans);

	}

}
