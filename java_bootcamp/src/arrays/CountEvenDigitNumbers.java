package arrays;

public class CountEvenDigitNumbers {
	public static void main(String[] args) {
		//TODO: get the no of even digit number present in array
		int[] arr = {11,233,1,3,45345,4455,45,2022,234323};
		int ans = countEvenDigitNumbers(arr);
		System.out.println(ans);
		
	}

	public static int countEvenDigitNumbers(int[] arr) {
		int evenCounter = 0;
		for(int i=0;i<arr.length;i++) {
			int number = arr[i];
			int digit = countDigit3(number);
			if(digit%2==0) {
				evenCounter++;
			}
		}
		return evenCounter;
	}
	
	// first method of counting digits
	
	public static int countDigit1(int n) {
		if(n<0) {
			n = n*-1;
		}
		int nCount = 0;		
		while(n>0) {
		n=n/10;
		nCount++;
		}		
		return nCount;
	}
	
	//second method of counting digits
	
	public static int countDigit2(int n) {
		if(n<0) {
			n = n*-1;
		}
		int nCount =(int) Math.log10(n)+1;		
		return nCount;
	}
	
	//third method of counting digits
	
	public static int countDigit3(int n) {
		if(n<0) {
			n = n*-1;
		}
		String s=String.valueOf(n);
		int nCount = s.length();	
		return nCount;
	}
}
