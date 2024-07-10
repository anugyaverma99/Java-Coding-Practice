//write a java program to find a factorial of a given number.

import java.util.Scanner;
public class practiceset5q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact=fact*i;

        // }
        // System.out.printf("The factorial of %d is %d.",n,fact);

        //USING WHILE LOOP
        int n1=n;
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.printf("The fact of %d is %d.",n1,fact);

    }
}
