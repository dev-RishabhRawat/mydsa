package handsOn5;

public class MyClass {

	public StringBuilder oddPosCharacters(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				sb.append(s.charAt(i));
			}
		}
		return sb;
	}

}
