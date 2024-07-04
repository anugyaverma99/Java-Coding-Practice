// write a java program to replaces spaces with underscores in a given string 

import java.util.Scanner;
public class practiceset3stringsq2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=s.nextLine();
        String str=st.replace(" ","_");
        System.out.println(str);

    }
}
