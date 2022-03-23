package handsOn4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO  read a String value using Scanner and print the smallest vowel. Assume all input values are in lower case.
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		MyClass obj = new MyClass();
		System.out.println(obj.smallestVowel(s));
		sc.close();
	}

}
