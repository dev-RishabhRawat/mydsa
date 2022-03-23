package watch;

import java.util.Scanner;

public class MyClass {
	public static int countWatchesByBrand(Watch[] watch , String brand) {
		int cnt=0;
		for(int i=0;i<watch.length;i++) {
			String watchBrand = watch[i].getBrand();
			char c = watchBrand.charAt(0);
			c = Character.toLowerCase(c);
			if(watchBrand.equalsIgnoreCase(brand) && (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') ) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Watch[] watch = new Watch[4];
		for(int i=0;i<watch.length;i++) {
			int watchId = sc.nextInt();
			sc.nextLine();
			String watchName = sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine();
			String brand = sc.nextLine();
			watch[i] = new Watch(watchId,watchName,price,brand);
			
		}
		String s = sc.nextLine();
		int res = countWatchesByBrand(watch, s);
		if(res!=0)
		System.out.println(res);

	}

}
