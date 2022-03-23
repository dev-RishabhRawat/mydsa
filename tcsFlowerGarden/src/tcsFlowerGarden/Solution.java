package tcsFlowerGarden;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Flower[] flower = new Flower[4];
		for(int i=0; i<flower.length;i++) {
			int flowerId = sc.nextInt();
			sc.nextLine();
			String flowerType = sc.nextLine();
			String state = sc.nextLine();
			sc.nextLine();
			int price = sc.nextInt();
			flower[i] = new Flower(flowerId,flowerType,state,price);
		}
		sc.nextLine();
		String inputState = sc.nextLine();
		sc.close();
		Flower f = Flower.getFlowerTypeByState(flower,inputState);
		if(f!=null) {
			System.out.print(f.getFlowerType());
		}else {
			System.out.println("Not Found!");
		}
	}



}
