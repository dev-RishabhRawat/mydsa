package handsOn10;

import java.util.Scanner;

public class MyClass {
	public static Inventory[] replenish(int limit, Inventory[] inventory){
		Inventory[] res = null;
		int cnt = 0;
		for(int i=0;i<inventory.length;i++) {
			if(inventory[i].getThreshold() <= limit) {
				cnt++;
			}
		}
		res = new Inventory[cnt];
		int j=0;
		for(int i=0;i<inventory.length;i++) {
			if(inventory[i].getThreshold() <= limit) {
				res[j++] = inventory[i];
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inventory[] iv = new Inventory[4];
		for(int i=0;i<iv.length;i++) {
			int id = sc.nextInt();
			int mQ = sc.nextInt();
			int cQ = sc.nextInt();
			int t = sc.nextInt();
			iv[i] = new Inventory(id,mQ,cQ,t);
		}
		int limit = sc.nextInt();
		sc.nextLine();
		sc.close();
		Inventory[] res = replenish(limit,iv);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i].getInventoryId() + " "  );
			if(res[i].getThreshold() >= 75) {
				System.out.print("Critical Filling");
			}else if(res[i].getThreshold() >= 50 && res[i].getThreshold() <=74 ) {
				System.out.print("Moderate Filling");
			}else {
				System.out.print("Non-Critical Filling");
			}
			System.out.println();
		}
	}
}
