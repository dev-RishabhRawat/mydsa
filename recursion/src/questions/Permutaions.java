package questions;

import java.util.ArrayList;

public class Permutaions {
	public static ArrayList<String> permutations(String p,String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> c1 = new ArrayList<>();
		for(int i=0;i<=p.length();i++) {
			 String f = p.substring(0,i);
			 String s = p.substring(i,p.length());
			 c1.addAll(permutations(f+ch+s, up.substring(1)));
		}
		return c1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		ArrayList<String> list = permutations("",s);
		System.out.println(list);
		
	}

}
