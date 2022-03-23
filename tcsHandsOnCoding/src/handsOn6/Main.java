package handsOn6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Integer> medicinePriceForGivenDisease(Medicine[] medicine,String disease)
	 {
	   	ArrayList<Integer> list = new ArrayList<Integer>();
	  	for(int i=0;i<medicine.length;i++){
	    	if(medicine[i].getDisease().equalsIgnoreCase(disease)){
	        	int medPrice = medicine[i].getPrice();
	          	list.add(medPrice);
	        }
	    }
	  // Arrays.sort(list);
	   return list;
	 }
	public static void main(String[] args) {
		// TODO This method will take a String parameter named disease along with the other parameter as array of Medicine objects. 
		//The method will return an array of Integer containing the price of the medicines in ascending order, 
		//if the given input(disease) matches the disease attribute of the medicine objects in the Array.'
		 Medicine[] medicine = new Medicine[4];
		  String search;

		  Scanner sc = new Scanner(System.in);

		  for (int i = 0; i < medicine.length; i++) {
		   String medicineName = sc.nextLine();
		   String batchNo = sc.nextLine();
		   String disease = sc.nextLine();
		   int price = sc.nextInt();
		   sc.nextLine();
		   medicine[i] = new Medicine(medicineName, batchNo, disease, price);

		  }

		  search = sc.nextLine();
		  ArrayList<Integer> price = medicinePriceForGivenDisease(medicine, search);
		  
		  for(int i=0;i<price.size();i++) {
		   System.out.println(price.get(i));
		  }

	}

}

/*
 * Input:  
Hyadry
FHW0602
EyeDryness
140
Dolo
FHW0603
Fever
10
OpsionHA
P5011
EyeDryness
435
Mucinex
C0011
Cold
15
EyeDryness

Output:
140
435
*/

