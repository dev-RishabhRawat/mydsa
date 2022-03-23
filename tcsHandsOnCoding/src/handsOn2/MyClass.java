package handsOn2;

                  import java.util.Scanner;

class MyClass {
	public static void countVowels(String s) {
		String str = s.toUpperCase();
		int vowels = 0;
		int consonants = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
          if(isVowel(ch)){
            vowels++;
          }else if(isDigit(ch)){
        	  continue;
          }else {
        	  consonants++;
          }
          
		}
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of Consonants: "+consonants);
	}
	public static boolean isVowel(char c) {
		return (c == 'A' || c == 'E' || c =='I' || c == 'O' || c == 'U');		
	}
  	public static boolean isDigit(char c){
    	int digit = (int)c;
      	if(digit>=33 && digit<=57){
          return true;
        }
      return false;
    }
	public static void main(String[] args) {
		// TODO count vowels and consonants
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().trim();
		 countVowels(str);

	}

}
            