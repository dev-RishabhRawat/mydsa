package handsOn9;
import java.util.Scanner;

public class MyClass
{

public static void main(String[] args)
{
Sim[] cards = new Sim[5];

Scanner sc = new Scanner(System.in);

for(int i = 0;i<5;i++)
{
int simId = sc.nextInt();sc.nextLine();
String customerName = sc.nextLine();
double balance = sc.nextDouble();
double ratePerSecond = sc.nextDouble();
sc.nextLine();
String circle = sc.nextLine();

cards[i] = new Sim(simId,customerName, balance,ratePerSecond, circle);
}

String circle1 = sc.nextLine();
String circle2 = sc.nextLine();

Sim[] result = transferCustomerCircle(cards, circle1, circle2);

for(Sim s: result)
System.out.println(s.getSimId()+" "+s.getCustomerName()+" "
+s.getCircle() + " " + s.getRatePerSecond());

}

public static Sim[] transferCustomerCircle(Sim[] cards, String circle1, String circle2)
{
//method logic
int count=0;
for(int i=0;i<cards.length;i++){
if(cards[i].getCircle().equalsIgnoreCase(circle1)){
count++;

}
}
Sim[] cardsArr = new Sim[count];
Sim temp;
int j=0;
for(int i=0;i<cards.length;i++){
	if(cards[i].getCircle().equalsIgnoreCase(circle1)){
	cards[i].setCircle(circle2);
	cardsArr[j++]=cards[i];
	}
}
for(int i=0;i<cardsArr.length;i++){
for(int k=i+1;k<cardsArr.length;k++){
if(cardsArr[i].getRatePerSecond()>cardsArr[k].getRatePerSecond()){
temp = cardsArr[k];
cardsArr[i]=cardsArr[k];
cardsArr[k] = temp;
}
}
}
return cards;

}

}

class Sim
{
//code to build Sim class
	int simId;
	String customerName;
	double balance;
	double ratePerSecond;
	String circle;
	
	// constructor for sim
	
	public Sim(int sId,String cN,double b,double r,String c){
	this.simId = sId;
	this.customerName = cN;
	this.balance = b;
	this.ratePerSecond = r;
	this.circle = c;
	}
		// getters for sim
		public int getSimId(){
		return this.simId;
		}
		public String getCustomerName(){
		return this.customerName;
		}
		public double getBalance(){
		return this.balance;
		}
		public double getRatePerSecond(){
		return this.ratePerSecond;
		}
		public String getCircle(){
		return this.circle;
		}



	// setters for class Sim
	public void setSimId(int simId){
	this.simId = simId;
	}
	public void setCustomerName(String cn){
	this.customerName = cn;
	}
	public void setBalance(double b){
	this.balance = b;
	}
	public void setratePerSecond(double r){
	this.ratePerSecond = r;
	}
	public void setCircle(String c){
	this.circle = c;
	}
}



/*
1
raj
100
1.5
KOL
2
chetan
200
1.6
AHD
3
asha
150
1.7
MUM
4
kiran
50
2.2
AHD
5
vijay
130
1.8
AHD
AHD
KOL
*/