package handsOn11;

public class Student {
int rollNo;
String name;
String branch;
double score;
boolean dayScholar;
public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.branch = branch;
	this.score = score;
	this.dayScholar = dayScholar;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}
public boolean isDayScholar() {
	return dayScholar;
}
public void setDayScholar(boolean dayScholar) {
	this.dayScholar = dayScholar;
}

}
