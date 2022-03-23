package string;

import java.util.Arrays;
import java.util.Scanner;

public class PrintSmallerVowel {
	
	public static void printSmallestVowelCharacter(String st) {
		String temp = "";
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if(ch >='a' && ch <='z') {
				if(isVowel(ch)) {
					temp = temp + ch;
				}
			}else {
				continue;
			}
		}
		// Converting input string to character array
        char tempArray[] = temp.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // for minimum character
        System.out.println(tempArray[0]);
        //for maximum character
        System.out.println(tempArray[tempArray.length-1]);
        
	}
	public static boolean isVowel(char c) {
		return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
	public static void main(String[] args) {
//		In the main method, write code to read a String value using Scanner and print the smallest vowel. Assume
//		all input values are in lower case.
//
//		E.g If the input value is "matrix" then output will be a (since there are two vowels a and i 
//		where a is smaller as per ASCII sequence).

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		printSmallestVowelCharacter(str);
		
	}

}
