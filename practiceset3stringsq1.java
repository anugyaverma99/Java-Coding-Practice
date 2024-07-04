// write a java program to convert a string to uppercase and lowercase.

import java.util.Scanner;
public class practiceset3stringsq1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=s.next();
        System.out.println("Uppercase string: "+str.toUpperCase());
        System.out.println("Lowercase string: "+str.toLowerCase());
    }

    
}
