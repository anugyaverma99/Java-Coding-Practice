
// Question 3: Wite the java program that ask the user the to enter their name and print the given string with their name.

import java.util.Scanner;
 class practiceset1q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String str=sc.next();
        System.out.println("Hello! "+str+" ,have a good day.");

    }
}
