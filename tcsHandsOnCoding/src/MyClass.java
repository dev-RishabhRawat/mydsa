import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c==' ') {
				count++;
			}
		}
		
		String[] arr = s.split(" ");
		count = arr.length-1;
		if(count>0) {
			System.out.println(count);
		}else {
			System.out.println("No spaces");
		}

	}

}
