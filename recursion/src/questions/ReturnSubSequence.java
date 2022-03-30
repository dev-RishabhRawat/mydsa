package questions;

import java.util.ArrayList;

public class ReturnSubSequence {
	public static ArrayList<String> retSubSeq(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> ans = new ArrayList<>();
			ans.add(p);
			return ans;
		}
		char c = up.charAt(0);
		ArrayList<String> first = retSubSeq(p+c,up.substring(1));
		ArrayList<String> second = retSubSeq(p,up.substring(1));
		first.addAll(second);
		return first;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res = retSubSeq("", "abc");
		System.out.println(res);
		
	}

}
