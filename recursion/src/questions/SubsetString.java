package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetString {
	public static ArrayList<String> subSeq(String p,String str) {
	 if(str.isEmpty()) {
		 ArrayList<String> list = new ArrayList<>();
		 list.add(p);
		 return list;
	 }
	 char c = str.charAt(0);
	 ArrayList<String> left = subSeq(p+c,str.substring(1));
	 ArrayList<String> right = subSeq(p,str.substring(1));
	 left.addAll(right);
	 return left;
	}
	
	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> arr = subSeq("",str);
		Collections.sort(arr);
		System.out.println(arr);
		
	}
	
}
