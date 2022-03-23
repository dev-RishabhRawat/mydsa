package handsOn6;

public class Medicine {
	String medicineName;
	String batchNo;
	String disease;
	int price;
	public Medicine(String medicineName2, String batchNo2, String disease2, int price2) {
		// TODO Auto-generated constructor stub
		this.medicineName = medicineName2;
		this.batchNo = batchNo2;
		this.disease = disease2;
		this.price = price2;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
