package ArrayList;
import java.util.*;

public class ArrayListDemo {
	public static void addTen(Integer e) {
		System.out.println(e+10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(30);
		al.add(20);
		ArrayList<Integer> al2 = new ArrayList<>(List.of(90,60,42,85,36));
		System.out.println(al2);
		al.addAll(2,al2);
		Collections.sort(al);
		System.out.println(al);
		al.forEach(e->addTen(e));

	}

}
