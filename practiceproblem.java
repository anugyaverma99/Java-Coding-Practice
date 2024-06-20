// PROBLEM STATEMENT-- prog. to calculate percentage of a student from marks of five subjects by taking marks as user input out of 100.

import java.util.Scanner;
public class practiceproblem {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the marks of hindi");
    int a=sc.nextInt();
    System.out.println("enter the marks of english");
    int b=sc.nextInt();
    System.out.println("enter the marks of maths");
    int c=sc.nextInt();
    System.out.println("enter the marks of science");
    int d=sc.nextInt();
    System.out.println("enter the marks of social science");
    int e=sc.nextInt();
    float sum=a+b+c+d+e;
    float avg=sum/500;
    float perc=avg*100;

    System.out.println("The percentage of the student is :"+perc );
}
}
