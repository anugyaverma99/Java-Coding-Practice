// write a java program to check whether a given number found in an integer array;

import java.util.Scanner;
public class practiceset6q2 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        boolean r=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value you want to search in an array");
       int n= sc.nextInt();
        for(int i=0;i<arr.length;i++){
           if(arr[i]==n){
            r=true;
           }
        }
        if(r){
            System.out.println("element found ");
        }
        else{
            System.out.println("element not found");
        }
        
    }
}
