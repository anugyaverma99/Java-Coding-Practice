
//Question 5: write the java program to detect whether the number enter by the user is a integer or not.

import java.util.Scanner;
public class practiceset1q5 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        boolean sc=s.hasNextInt();
        if(sc){
            System.out.println("it is a integer");

        }

        else{
            System.out.println("it is not a integer");
        }
    }
}
