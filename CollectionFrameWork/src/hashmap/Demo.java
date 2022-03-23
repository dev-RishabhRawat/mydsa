package hashmap;
import java.util.*;
public class Demo {

	public static void main(String[] args) {

		// initializing
		HashMap<Integer,Integer> map = new HashMap();
		map.put(1, 10);
		map.put(3, 20);
		map.put(2, 30);
		System.out.println(map);
//		System.out.println(map.get(3));
//		map.replace(3, "teen");
//		System.out.println(map.get(3));
//		System.out.println(map.keySet());
		int maxValue = Collections.max(map.values());
		System.out.println(maxValue);
		int minValue = Collections.min(map.values());
		System.out.println(minValue);
		
		System.out.println(map.size());
		for(HashMap.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
