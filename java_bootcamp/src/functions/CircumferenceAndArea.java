package functions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircumferenceAndArea {

	public static void main(String[] args) {
		// TODO Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of circle");
		int radius = sc.nextInt();
		circleCircumference(radius);
		circleArea(radius);
	}
	public static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void circleCircumference(int r) {
		double circumference =  2*Math.PI*r;
		System.out.println("Circumference : "+ df.format(circumference) );
	}
	
	public static void circleArea(int r) {
		double area =  Math.PI*r*r;
		System.out.println("Area : "+ df.format(area));
	}
}
