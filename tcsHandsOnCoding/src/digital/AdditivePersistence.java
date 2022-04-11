package digital;

/*
additivePersistence(1679583) - > 3
1 + 6 + 7 + 9 + 5 + 8 + 3 = 39
3 + 9 = 12
1 + 2 = 3

it takes 3 iteration to reach a single digit number
*/
public class AdditivePersistence {

	public static int additivePersistence(int n , int count) {
		if(n%10 == n) {
			return count;
		}
		int sum = 0;
		int num = n;
		while(num>0) {
			sum += num%10;
			num/=10;
		}
		
		return additivePersistence(sum,count+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(additivePersistence(77,0));
	}

}
