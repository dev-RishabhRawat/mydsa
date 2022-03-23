package handsOn1;

import java.util.Scanner;
class MyClass{ 
	public static void main(String [] args){
		// TODO In the main method, write code to read a numeric
		//digit(without any alphabets or special characters) using Scanner and print it in the reverse sequence as they appear in the input.
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 
		int reverse = 0; 
		while(number>0){ 
			reverse = reverse*10 + number%10;
			number = number/10; 
			} 
System.out.println("Reverse of the number is "+reverse); } }