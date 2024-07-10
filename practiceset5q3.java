// write a java [program to enter a table of n.]

import java.util.Scanner;
public class practiceset5q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        System.out.printf("Table of %d",n);
        System.out.println("/n");
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+i*n);
        }
    }
}
