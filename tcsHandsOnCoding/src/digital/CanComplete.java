package digital;
/*
An input string can be completed if additional letters can be added and no letters
need to be taken away to match the word. Furthermore, the order of the letters in
the input string must be the same as the order of letters in the final word.
Create a function that, given an input string, determines if the word can be
completed.
canComplete( "butl", "beautiful") - true
}We can add "ea" between "b" and "u", and "ifu" between "t" and "1".
canComplete("butlz", "beautiful")- false
fi "z" does not exist in the word beautiful1.
canCompiete("tulb", "beautiful") - fal se
1 Although "t", "u", "1" and "b" all exist in "beautiful", they are incorrectly
ordered.
canCamplete("bbut1", "beaut iful") - false
1 Too many "b"s, beautiful has only 1
*/

public class CanComplete {
	public static boolean canCompiete(String in,String str) {
		int start = -1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<in.length();i++) {
			char c1 = in.charAt(i);
			for(int j=start+1;j<str.length();j++) {
				char c2 = str.charAt(j);
				if(c1 == c2) {
					sb.append(c2);
					start = j;
					break;
				}
			}
		}
		
		if(in.equals(sb.toString())) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean res = canCompiete("butl", "beautiful");
		System.out.println(res);
	}

}
