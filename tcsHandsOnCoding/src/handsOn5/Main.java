package handsOn5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO  read a String value using Scanner and print characters at odd position as single String
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		MyClass obj = new MyClass();
		System.out.println(obj.oddPosCharacters(s));
		sc.close();
	}

}
