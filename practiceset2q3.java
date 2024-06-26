// use comparision operator to determine whether a given number is greater than a user entered number or not;

import java.util.Scanner;
public class practiceset2q3 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=s.nextInt();
        if(a>45)
        System.out.println("a is greater than 45" );
        else if(a==45)
        System.out.println("a is equal to 45" );
        else
        System.out.println("a is smaller than 45" );


    }
}
