package tcsFlowerGarden;

import java.util.Scanner;

public class Flower {
	private int flowerId;
	private String flowerType;
	private String state;
	private int price;
	 
 public Flower(int flowerId, String flowerType, String state, int price) {
		this.flowerId = flowerId;
		this.flowerType = flowerType;
		this.state = state;
		this.price = price;
	}
	
	 public int getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(int flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerType() {
		return flowerType;
	}
	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static Flower getFlowerTypeByState(Flower[] flower, String inputState) {
		for(int i=0;i<flower.length;i++) {
			if(flower[i].getState().equalsIgnoreCase(inputState)) {
				return flower[i];
			}
		}
		return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Flower[] flower = new Flower[2];
		for(int i=0; i<flower.length;i++) {
			int flowerId = sc.nextInt();
			sc.nextLine();
			String flowerType = sc.nextLine();
			String state = sc.nextLine();			
			int price = sc.nextInt();
			flower[i] = new Flower(flowerId,flowerType,state,price);
		}
		sc.nextLine();
		String userInput = sc.nextLine();
		Flower f = getFlowerTypeByState(flower, userInput);
		if(f!=null) {
			System.out.println(f.getFlowerType());
		}else {
			System.out.println("Not found");
		}
		sc.close();
	
	}
}
