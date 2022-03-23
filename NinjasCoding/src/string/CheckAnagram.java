package string;

import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO will check both string are anagram or not
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		a = a.toLowerCase();
		b = b.toLowerCase();
		boolean isAnagram = false;
		boolean isVisited[] = new boolean[b.length()];
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				char c = a.charAt(i);
				isAnagram = false;
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j) == c) {
//						isVisited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
			if(isAnagram) {
				System.out.println("Anagramm");
			}else {
				System.out.println("Not Anagram");
			}
		}else {
			System.out.println("Not Anagram");
		}
		
		
	}

}
