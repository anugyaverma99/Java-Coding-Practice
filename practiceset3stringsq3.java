//write a java program to replace <|name|> from given string with the input name.

import java.util.Scanner;
public class practiceset3stringsq3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="Dear <|name|>, thanks a lot";
        System.out.print("Enter your name: ");
        String s=sc.next();
        System.out.println(str.replace("<|name|>",s));

    }
}
