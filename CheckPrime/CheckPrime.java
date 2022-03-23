import java.util.Scanner;

public class CheckPrime {
	int number;
	CheckPrime(int num){
		this.number = num;
	}
    public int getNumber() {
        return number;
    }
	public void getResult(int number) {
        int flag=0;
		for(int i = 2 ; i <= (number/2); i++) {
			if(number%i == 0) {
				flag = 1;
                break;
			}
		}
        if(number == 1){
            System.out.println("Number is neither prime nor composite");
        }else if(flag == 1){
            System.out.println("Not a prime number it is composite");
        }else{
            System.out.println("Number is Prime number");
        }
	}
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check is it prime or not");
		int number = sc.nextInt();
		CheckPrime obj = new CheckPrime(number);
		obj.getResult(obj.getNumber());
        sc.close();
	}
}
