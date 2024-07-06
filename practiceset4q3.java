// calculate income tax paid by an employee to the government as per the given information.

import java.util.Scanner;
public class practiceset4q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        int s=sc.nextInt();
        float sw=(float)5/100;
        if(s<250000){
            System.out.println("no tax paid");
        }
        else if(s>=250000 && s<500000){
            float a=sw*s;
            System.out.println("5% tax paid: "+a);

        }
        else if(s>=500000 && s<1000000){
            sw=(float)20/100;
            float a=sw*s;
            System.out.println("20% tax paid: "+a);
        }
        else
        {
            sw=(float)30/100;
            float a=sw*s;
            System.out.println("30% tax paid: "+a);
        }


    }
}
