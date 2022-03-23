package watch;

public class Watch {
	private int watchId;
	private String watchName;
	private double price;
	private String brand;
	
	public Watch(int watchId, String watchName, double price, String brand) {
		super();
		this.watchId = watchId;
		this.watchName = watchName;
		this.price = price;
		this.brand = brand;
	}
	public int getWatchId() {
		return watchId;
	}
	public void setWatchId(int watchId) {
		this.watchId = watchId;
	}
	public String getWatchName() {
		return watchName;
	}
	public void setWatchName(String watchName) {
		this.watchName = watchName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
