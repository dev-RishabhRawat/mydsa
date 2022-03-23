package digital;

import java.util.*;
public class LongestCommonSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(getLCM(s1,s2));

	}

	private static String getLCM(String s1, String s2) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s1.length();i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
		}
		
		for(int i=0;i<s2.length();i++) {
			if(map.containsKey(s2.charAt(i))) {
				sb.append(s2.charAt(i));
			}
		}
		return null;
	}

}
