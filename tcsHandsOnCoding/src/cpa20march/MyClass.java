package cpa20march;

import java.util.*;
public class MyClass {
	
	public static Flowers findMinPriceByType(Flowers[] flower,String type) {
		Flowers ans = null;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<flower.length;i++) {
			if(flower[i].getType().equalsIgnoreCase(type) && flower[i].getRating()>3) {
				min = Math.min(min, flower[i].getPrice());
			}
		}
		if(min != Integer.MAX_VALUE) {
			for(int i=0;i<flower.length;i++) {
				if(flower[i].getPrice() == min) {
					ans = flower[i];
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Flowers[] flower = new Flowers[4];
		for(int i=0;i<flower.length;i++) {
			int flowerId = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int price = sc.nextInt();
			int rating = sc.nextInt();
			sc.nextLine();
			String type = sc.nextLine();
			flower[i] = new Flowers(flowerId,name,price,rating,type);
		}
		
		String inp = sc.nextLine();
		Flowers res = findMinPriceByType(flower, inp);
		if(res!=null) {
			System.out.println(res.getFlowerId());
		}else {
			System.out.println("There is no flower with given type");
		}
		
	}

}

/*
 * 
 123
yellow
3000
5
eph
345
snow
2500
4
eph
321
yarrow
1000
4
pere
213
red
2250
4
eph
eph
*/ 
