
// Question 4: Write a java pogram to convert kms into miles

import java.util.Scanner;
public class practiceset1q4 {
    public static void main(String args[]){
        System.out.println("ENTER THE NUMBER TO BE CONVERTED");
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=0.621371;
        double result=a*b;
        System.out.println(a+" km is equal to "+result+" miles");

    }
}
