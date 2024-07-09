// write a java rogram to check the type of the website from the url.

import java.util.Scanner;
public class practiceset4q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.contains(".com")){
            System.out.println("it is a commercial website");
        }
        else if(s.contains(".org")){
            System.out.println("it is a organization website");
        }
        else if(s.contains(".in")){
            System.out.println("it is a indian website");
        }
        else{
            System.out.println("it is a invalid website");
        }
            
        
    }
}
