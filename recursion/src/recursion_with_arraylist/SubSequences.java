package recursion_with_arraylist;

import java.util.ArrayList;

public class SubSequences {
	
	public static ArrayList<String> getS(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			if(!p.isEmpty()) {
				list.add(p);
			}
			return list;
		}
		char c = up.charAt(0);
		ArrayList<String> left = getS(p+c , up.substring(1));
		ArrayList<String> right = getS(p,up.substring(1));
		left.addAll(right);
		return left;
	}
	
	// remove x from a string
	public static String removeX(String p, String up) {
		if(up.isEmpty()) {
			return p;
		}
		char c = up.charAt(0);
		if(c=='x') {
			return removeX(p, up.substring(1));
		}else {
			return removeX(p+c, up.substring(1));
		}
	}
	
	// remove x from a string method 2:	
	public static String removeX2(String up) {
		if(up.isEmpty()) {
			return up;
		}
		char c = up.charAt(0);
		String ans = "";
		if(c!='x') {
			ans+=c;
		}
		return ans + removeX2(up.substring(1));
	}
	
	
	// replace b to x from a string :	
	public static String replaceB(String up) {
		if(up.isEmpty()) {
			return up;
		}
		char c = up.charAt(0);
		String ans = "";
		if(c=='b') {
			ans +='x';
		}else {
			ans+=c;
		}
		String smallAns = replaceB(up.substring(1));
		return ans + smallAns;
	}


	
	// remove consecutive duplicates	
	public static String removeConsecutiveDuplicates(String up) {
		if(up.length()<=1) {
			return up;
		}
		char c0 = up.charAt(0);
		char c1 = up.charAt(1);
		String ans = "";
		if(c0==c1) {
			return removeConsecutiveDuplicates(up.substring(1));
		}else {
			ans +=c0;
			String smallAns = removeConsecutiveDuplicates(up.substring(1));
			return ans+smallAns;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> res = getS("","abc");
//		System.out.println(res);
		
		System.out.println(removeConsecutiveDuplicates("aabcdefgghhiiijjjjjjkkklllll"));

	}

}
