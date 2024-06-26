// java program to encrypt a grade by adding 8 to it and then decrypt it to show the correct grade;

import java.util.Scanner;
public class practiceset2q2 {
    public static void main(String args[]){
       System.out.println("Enter a character");
       Scanner s=new Scanner(System.in);
       char c=s.next().charAt(0);
       char a=(char)(c+8);
       System.out.print("Decrypted character is: ");
       System.out.println(a);


    }
}
