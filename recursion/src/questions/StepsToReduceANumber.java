package questions;

public class StepsToReduceANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		System.out.println(numberOfSteps(num));

	}

	public static int numberOfSteps(int num) {
		// TODO if no is even divide by 2 otherwise substract 1
		return helper(num,0);
		
	}
	public static int helper(int num, int steps) {
		if(num==0) {
			return steps;
		}
		if(num%2==0) return helper(num/2,steps+1);
		else return helper(num-1,steps+1);
	}

}
