package hackerrank.handson;

public class Account {
	int id;
    double balance;
    double intersetRate;
	public Account(int id, double balance, double intersetRate) {
		this.id = id;
		this.balance = balance;
		this.intersetRate = intersetRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getIntersetRate() {
		return intersetRate;
	}
	public void setIntersetRate(double intersetRate) {
		this.intersetRate = intersetRate;
	}
    
}
