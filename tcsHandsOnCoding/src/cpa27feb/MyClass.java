package cpa27feb;

import java.util.Scanner;

public class MyClass {
	
	public static Fruits findMaximumPriceByRating(Fruits[] fruit,int rating) {
		Fruits ans = null;
		int max = 0;
		for(int i=0;i<fruit.length;i++) {
			if(fruit[i].getRating()>rating) {
				max = Math.max(max, fruit[i].getPrice());
			}
		}
		for(int i=0;i<fruit.length;i++) {
			if(fruit[i].getPrice() == max) {
				ans = fruit[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fruits[] fruit = new Fruits[4];
		for(int i=0;i<4;i++) {
			int fId = sc.nextInt();
			sc.nextLine();
			String fName = sc.nextLine();
			int price = sc.nextInt();
			int rating = sc.nextInt();
			fruit[i] = new Fruits(fId,fName,price,rating);
			
		}
		int r = sc.nextInt();
		System.out.println(findMaximumPriceByRating(fruit,r).getFruitId());
	}

}
class Fruits {
	 private int fruitId;
	 private String fruitName;
	 private int price;
	 private int rating;
	 
	 
	 
	public Fruits(int fruitId, String fruitName, int price, int rating) {
		this.fruitId = fruitId;
		this.fruitName = fruitName;
		this.price = price;
		this.rating = rating;
	}
	
	public int getFruitId() {
		return fruitId;
	}
	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	 
}
