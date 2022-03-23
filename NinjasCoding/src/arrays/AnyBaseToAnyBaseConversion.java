package arrays;

import java.util.Scanner;

public class AnyBaseToAnyBaseConversion {
	
	  public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	      int  destBase= scn.nextInt();
	      scn.close();
	      int decimal = getValueInDecimal(n,sourceBase);
//	      System.out.println(decimal);
	      int baseB2Value = getValueInBaseB2(decimal,destBase);
	      System.out.println(baseB2Value);
	   }   
	   public static int getValueInDecimal(int n,int b1){
	       int counter = 0;
	       int res = 0;
	       while(n>0){
	           int rem = n%10;
	           res += rem*Math.pow(b1,counter);
	           counter++;
	           n=n/10;
	       }
	       return res;
	   }
	   public static int getValueInBaseB2(int n , int b){
	       int res=0;
	       int counter = 0;
	       while(n>0){
	           int rem = n%b;
	           res += rem*Math.pow(10, counter);
	           n=n/b;
	           counter++;
	       }
	       return res;
	   } 
	  }

