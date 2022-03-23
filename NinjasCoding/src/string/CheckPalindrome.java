package string;
import java.util.*;
public class CheckPalindrome {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int strLength = A.length();
        
        // first method
        // String s="";
        // for(int i=strLength-1;i>=0;i--){
        // s=s+A.charAt(i);
        // }
        
        // second method
        String s = new StringBuilder(A).reverse().toString();
        if(s.equalsIgnoreCase(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
