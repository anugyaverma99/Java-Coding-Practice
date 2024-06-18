
// Write the java program to print the sum of three numbers

import java.util.Scanner;
public class practiceset1q1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int a=s.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int b=s.nextInt();
        System.out.println("ENTER THE THIRD NUMBER");
        int c=s.nextInt();
        System.out.print("SUM OF THREE NUMBERS:");
        int sum=a+b+c;
        System.out.println(sum);
    }
}
