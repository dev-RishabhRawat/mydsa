package string;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void countVowels(String st) {
		String str = st.toUpperCase();
		int vowels = 0;
		int consonants = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				if(isVowel(ch)) {
					vowels++;
				}else {
					consonants++;
				}
			}else {
				continue;
			}
		}
		System.out.println("vowels : "+vowels);
		System.out.println("consonants : "+consonants);
	}
	public static boolean isVowel(char c) {
		return (c == 'A' || c == 'E' || c =='I' || c == 'O' || c == 'U');		
	}
	public static void main(String[] args) {
		// TODO count vowels and consonants
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 countVowels(str);

	}

}
