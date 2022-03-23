package string;
import java.util.*;
public class CheckAnagram4 {

	public static boolean isAnagram(String s1,String s2) {
		char[] str1 = s1.toLowerCase().toCharArray();
		char[] str2 = s2.toLowerCase().toCharArray();
		if(s1.length() != s2.length()) {
			return false;
		}else {
			Arrays.sort(str1);
			Arrays.sort(str2);
			return Arrays.equals(str1, str2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "CAT";
		String s2 = "TAwC";
		boolean isAnagram = isAnagram(s1,s2);
		System.out.println(isAnagram?"Anagram":"Not Anagram");
	}

}
