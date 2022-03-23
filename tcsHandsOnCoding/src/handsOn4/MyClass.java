package handsOn4;

public class MyClass {
	public  char smallestVowel(String s) {
		String str = s.toLowerCase();
		int ascii = Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='i') {
				int aCode = (int)c;
				if(aCode<ascii) {
					ascii = aCode;
				}else {
					continue;
				}
			}
		}
		return (char)ascii;
	}


}
