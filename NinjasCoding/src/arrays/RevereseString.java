package arrays;

import java.util.Scanner;

public class RevereseString {
	 public static void swap(String[] arr,int i,int j){
	        String temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
		public static String reverseString(String str) 
		{
			//Write your code here
	        str = str.trim();
	        String[] words = str.split(" ");
	        int s = 0;
	        int e = words.length-1;
	        while(s<=e){
	            swap(words,s,e);
	            s++;
	            e--;
	        }
	       StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < words.length; i++) {
	         sb.append(words[i]+" ");
	      }
	     return sb.toString();
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String str = reverseString(s);
			System.out.println(str + " ");
		}
}
