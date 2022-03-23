package string;

import java.util.Scanner;

public class CheckAnagram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isAnagram = false;
		String a = sc.nextLine();
		String b = sc.nextLine();
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length() == b.length()) {
			// take two arrays
			int a_array[] = new int[256];
			int b_array[] = new int[256];
			
			for(char c:a.toCharArray()) {
				int index = (int)c;
				a_array[index]++;
			}
			for(char c:b.toCharArray()) {
				int index = (int)c;
				b_array[index]++;
			}
			for(int i=0;i<256;i++) {
				if(a_array[i] == b_array[i]) {
					isAnagram = true;
					break;
				}
			}
			if(isAnagram) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
		}else {
			System.out.println("Not Anagram");
		}

	}

}
