package string;

import java.util.Scanner;

public class PrintConsonantCharacters {
	
	public static void printConsonants(String st) {
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if(ch >='a' && ch <='z') {
				if(!isVowel(ch)) {
					System.out.print(ch);
				}
			}else {
				continue;
			}
		}
	}
	public static boolean isVowel(char c) {
		return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
	public static void main(String[] args) {

		/* In the main method, read a String and print all consonants characters (in lower case) 
		 * in the sequence as they appear in the input value. 
		 * Please note: The consonants are characters that are not vowels.
		 **
		 */
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		printConsonants(str);
		
	}

}
