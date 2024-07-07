// write a java program to check whether the input year is leap year or not

import java.util.Scanner;
public class practiceset4q5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int n=sc.nextInt();
        if(((n%4==0) && (n%100 != 0)) ||(n%400==0) ){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
}
