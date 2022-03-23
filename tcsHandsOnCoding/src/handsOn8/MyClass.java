package handsOn8;
import java.util.*;
/*
 * 
1
India
Batting
2500000
2
Australia
Batting
1000000
3
Srilanka
Bowling
1700000
4
England
Bowling
2000000
Batting
 */
public class MyClass {
	
	public static Player[] searchPlayerForMatch(Player[] player, String side) {
		int count=0;
		for(int i=0;i<player.length;i++) {
			if(player[i].getSide().equalsIgnoreCase(side))
				count++;
		}
		Player[] pArr = new Player[count];
		int j=0;
		for(int i=0;i<player.length;i++) {
			if(player[i].getSide().equalsIgnoreCase(side))
				pArr[j++]=player[i];
		}
		Player temp;
		for(int i=0;i<pArr.length;i++) {
			{
				for(int k=i+1;k<pArr.length;k++) {
					if(pArr[i].getId()>pArr[k].getId()) {
						temp = pArr[k];
						pArr[i]=pArr[k];
						pArr[k]=temp;
					}
				}
			}
		}
		return pArr;
	}
	
	public static void main(String[] args) {
		//code to read values
		Scanner sc = new Scanner(System.in);
		Player[] player = new Player[4];
		for(int i=0;i<player.length;i++) {
			int pId = sc.nextInt();
			sc.nextLine();
			String pCountry = sc.nextLine();
			String pSide = sc.nextLine();
			double pPrice = sc.nextDouble();
			sc.nextLine();
			player[i] = new Player(pId,pCountry,pSide,pPrice);
		}
		String side = sc.nextLine();
		sc.close();
		//code to call required method
		Player[] res = searchPlayerForMatch(player,side);
		
		//code to display the result
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i].getId());
		}
		
	}

}
class Player{
	//code to build Player class
	int id;
	String country;
	String side;
	double price;
	
	public Player(int id, String country, String side, double price) {
		super();
		this.id = id;
		this.country = country;
		this.side = side;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}