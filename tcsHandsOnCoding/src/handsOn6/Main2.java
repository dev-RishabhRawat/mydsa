package handsOn6;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Medicine[] medicine=new Medicine[4];
		 Scanner s=new Scanner(System.in);
		 String search;
		 for(int i=0;i<medicine.length;i++){
		     String medicineName=s.nextLine();
		  String batchNo=s.nextLine();
		  String disease=s.nextLine();

		  int price=s.nextInt();
		  s.nextLine();
		   medicine[i]=new Medicine(medicineName,batchNo,disease,price);  
		 }

		  search=s.nextLine();
		 s.close();
		 Integer[] pri =medicinePriceForGivenDisease(medicine,search);
		 for(int i=0;i<pri.length;i++){
		 System.out.println(pri[i]);
		 }
		 }

		 public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease)
		 { int count=0;
		 for(int i=0;i<medicine.length;i++){
		      if(medicine[i].getDisease().equalsIgnoreCase(disease))
		      count++;
		 }
		 Integer[] tem=new Integer[count];
		 int j=0;
		 for(int i=0;i<medicine.length;i++){
		     if(medicine[i].getDisease().equalsIgnoreCase(disease)){
		     tem[j]=medicine[i].getPrice();
		     j++;
		     }
		 }
		 Arrays.sort(tem);
		 return tem;
		 }

	}


