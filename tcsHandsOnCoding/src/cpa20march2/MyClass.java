package cpa20march2;

import java.util.*;
public class MyClass {
    
	
	public static int getCountOfResearchBasedOnRating(Institution[] institution,String location,int rating){
		int count=0;
		for(int i=0;i<institution.length;i++) {
			if(institution[i].isResearchCentre() && institution[i].getRating()>rating && institution[i].getInstitutionLocation().equalsIgnoreCase(location)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 Institution[] institution = new Institution[4]; 
	 for(int i=0;i<institution.length;i++) {
		 int institutieId = sc.nextInt();
		 sc.nextLine();
		 String institutionName = sc.nextLine();
		 String institutionLocation = sc.nextLine();
		 double rating = sc.nextDouble();
		 boolean researchCentre = sc.nextBoolean();
		 institution[i] = new Institution(institutieId,institutionName,institutionLocation,rating,researchCentre);
		 
	 }
	 sc.nextLine();
	 String location = sc.nextLine();
	 int rating = sc.nextInt();
	 int res = getCountOfResearchBasedOnRating(institution,location, rating);
	 if(res!=0) {
		 System.out.println(res);
	 }else {
		 System.out.println("No such Institutions");
	 }
	 
	}

}
