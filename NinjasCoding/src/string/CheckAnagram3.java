package string;

import java.util.Scanner;

public class CheckAnagram3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isAnagram = true;
		String a = sc.nextLine();
		String b = sc.nextLine();
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length() == b.length()) {
			int array[] = new int[256];
			
			for(char c:a.toCharArray()) {
				int index = (int)c;
				array[index]++;
			}
			for(char c:b.toCharArray()) {
				int index = (int)c;
				array[index]--;
			}
			for(int i=0;i<256;i++) {
				if(array[i] != 0 ) {
					isAnagram = false;
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
