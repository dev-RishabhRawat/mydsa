package questions;

import java.util.ArrayList;

public class PhonePad {

	/*
	 Given a string containing digits from 2-9 inclusive, return all possible letter combinations
	that the number could represent. Return the answer in any order.
	A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1
	does not map to any letters.
	 */
	
	public static String getChars(int n) {
		if(n==2) {
			return "abc";
		}else if(n==3) {
			return "def";
		}else if(n==4) {
			return "ghi";
		}else if(n==5) {
			return "jkl";
		}else if(n==6) {
			return "mno";
		}else if(n==7) {
			return "pqrs";
		}else if(n==8) {
			return "wxyz";
		}else if(n==9) {
			return "wxyz";
		}else {
			return "-1";
		}
	}
	public static void phonePad(String p, String up) {
		if(up.isEmpty()) {
			
			System.out.println(p.toUpperCase());
			return;
		}
		int digit = up.charAt(0) - '0';
		String chars = getChars(digit);
		for(int i= 0;i<chars.length();i++) {
			char ch = chars.charAt(i);
			phonePad(p+ch,up.substring(1));
		}
	}
	
	public static void diceRoll(String p,int up) {
		if(up == 0) {
			System.out.println(p);
			return;
		}
		for(int i=1;i<=up && i<=6;i++) {
			diceRoll((p+i),up-i);
		}
		
	}
	
	public static ArrayList<String> retDiceRoll(String p,int up) {
		if(up == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		for(int i=1;i<=up && i<=6;i++) {
			ans.addAll(retDiceRoll((p+i),up-i));
		}
		return ans;
		
	}
	public static void main(String[] args) {
//		phonePad("", "234");
		System.out.println(retDiceRoll("",4));
		
		
	}
}
