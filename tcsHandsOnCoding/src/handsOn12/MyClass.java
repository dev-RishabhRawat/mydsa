package handsOn12;
/*
 4
111
Aman Mittal
Prepaid
914.25
true
222
Rekha Kumar
Prepaid
1425.75
false
333
Samyra Gupta
Prepaid
1305.00
true
444
Mohit Saxena
Postpaid
1300.50
false
false
Prepaid
 */
import java.util.Scanner;
public class MyClass {
	// first method
	public static Bill findBillWithMaxBillAmountBasedOnStatus(Bill[] bill,boolean status){
		Bill res = null;
		int cnt = 0;
		double maxAmount = Integer.MIN_VALUE;
		for(int i=0;i<bill.length;i++) {
			if(bill[i].isStatus() == status) {
			
				if(bill[i].getBillAmount()>maxAmount) {
					maxAmount = bill[i].getBillAmount();
				}
				cnt++;
			}
		
		}
		if(cnt==0) return null;
		

		for(int i=0;i<bill.length;i++) {
			if(bill[i].isStatus() == status && bill[i].getBillAmount() == maxAmount) {
				res = bill[i];
			}
		}
		
		
		
		return res;
	}
	
	// second method
	public static int getCountWithTypeOfConnection(Bill[] bill, String type){
		int res = 0;
		for(int i=0;i<bill.length;i++) {
			
			if(bill[i].getTypeOfConnection().equalsIgnoreCase(type)) {
				res++;
			}
		}
	
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Bill[] bill = new Bill[n];
		for(int i=0;i<bill.length;i++) {
			int bN = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String tOC = sc.nextLine();
			double bA = sc.nextDouble();
			boolean st = sc.nextBoolean();
			bill[i] = new Bill(bN,name,tOC,bA,st);		
		}
		boolean status = sc.nextBoolean();
		sc.nextLine();
		String type = sc.nextLine();
		
		Bill res = findBillWithMaxBillAmountBasedOnStatus(bill,status);
		if(res != null) {		
				System.out.println(res.getBillNo()+ "#" + res.getName());
		}else {
			System.out.println("There are no bill with the given status");
		}
		int res2 = getCountWithTypeOfConnection(bill, type);
		if(res2!=0) {
			System.out.println(res2);
		}else {
			System.out.println("There are no bills with given type of connection");
		}
	}

}
class Bill{
	private int billNo;
	private String name;
	private String typeOfConnection;
	private double billAmount;
	private boolean status;
	public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
		super();
		this.billNo = billNo;
		this.name = name;
		this.typeOfConnection = typeOfConnection;
		this.billAmount = billAmount;
		this.status = status;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeOfConnection() {
		return typeOfConnection;
	}
	public void setTypeOfConnection(String typeOfConnection) {
		this.typeOfConnection = typeOfConnection;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}