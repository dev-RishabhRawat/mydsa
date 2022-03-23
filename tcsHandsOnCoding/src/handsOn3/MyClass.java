package handsOn3;

import java.util.*;

class MyClass {
    public static void printConsonants(String st) { 
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<st.length();i++ ) {
    		char c = st.charAt(i);
    		if(c !='a' && c !='e' && c !='i' && c !='o' && c !='u' ) {
    			sb.append(c);
    		}
    	}
    	System.out.println(sb.toString());
    }

    public static void main(String[] args) {
    	//todo:read a String and print all consonants characters (in lower case) in the sequence as they appear in the input value
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        printConsonants(str);
    }
}