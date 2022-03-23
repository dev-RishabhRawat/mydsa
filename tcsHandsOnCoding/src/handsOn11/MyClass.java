package handsOn11;


import java.util.Scanner;

public class MyClass {
	public static int findCountOfDayscholarStudents(Student[] st) {
		int scholar = 0;
		for(int i=0;i<st.length;i++) {
			if(st[i].getScore() > 80 && st[i].isDayScholar()) scholar++;
		}
		return scholar;
		
	}

	public static Student findStudentwithSecondHighestScore(Student[] st) {
		Student res = null;
		int h = Integer.MIN_VALUE;
		int sH = Integer.MIN_VALUE;
		for(int i=0;i<st.length;i++) {
			if(!(st[i].isDayScholar())) {
				if(st[i].getScore()>h) {
					sH = h;
					h = (int)st[i].getScore();
				}
				if(st[i].getScore()<h && st[i].getScore()>sH) {
					sH = (int)st[i].getScore();
				}
			}
		}
		
		
		for(int i=0;i<st.length;i++) {
			if(!(st[i].isDayScholar())) {
				if(st[i].getScore()==sH) {
					res = st[i];
				}
			}
		}		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[4];
		for(int i=0;i<st.length;i++) {
			int rollNo = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String branch = sc.nextLine();
			double score = sc.nextDouble();
			boolean dayScholar = sc.nextBoolean();
			st[i] = new Student(rollNo,name, branch,  score, dayScholar);
		}
		sc.close();
		int res1 = findCountOfDayscholarStudents(st);
		if(res1!=0) {
			System.out.println(res1);	
		}else {
			System.out.println("There are no such dayscholar students");
		}	
		
		Student res = findStudentwithSecondHighestScore(st);
		if(res != null) {
			System.out.println(res.getRollNo()+"#"+res.getName()+"#"+res.getScore());
		}else {
			System.out.println("There are no student from non day scholar");
		}
		
	}
}
