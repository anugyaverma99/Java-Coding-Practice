
// Question 2: write the java program to print the cgpa of the student based their particular marks in all the five subjects.


import java.util.Scanner;
public class practiceset1q2 {
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
    float avg=(sum/500)*10;
    // float perc=avg*100;

    System.out.println("The CGPA of the student is :"+avg );
}
}


