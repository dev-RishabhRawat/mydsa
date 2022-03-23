import java.io.*;

import java.util.*;
public class Solution {
    class Person{
        String first_name,last_name;
        public Person(String first_name, String last_name){
            this.first_name = first_name;
            this.last_name = last_name;
            System.out.println("Name : "+first_name+", "+last_name);
        }
    }
    class Student extends Person{
        public Student(String fname,String lname,int id, int[] arr){
        super(fname,lname);
        System.out.println("ID: "+id);
        int score=0;
        char grade;
        for(int i=0;i<arr.length;i++){
            score += arr[i];
        }
        score = score/arr.length;
        
        if(score>=90 && score<=100){
            grade = 'O';
        }else if(score>=80 && score<90){
            grade = 'E';
        }else if(score>=70 && score<80){
            grade = 'A';
        }else if(score>=55 && score<70){
            grade = 'P';
        }else if(score>=40 && score<55){
            grade = 'D';
        }else{
            grade = 'T';
        }
        System.out.println("Grade: "+grade);
        }
    }

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        int stuId = sc.nextInt();
        int n = sc.nextInt();
        int[] marks = new int[n];
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        Student obj = new Student(fname,lname,stuId,marks);
        
    }
}
