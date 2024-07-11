//write a java program to create an array of 5 floats and calculate their sum.

import java.util.Scanner;
public class practiceset6q1 {
    public static void main(String[] args) {
        float[] arr=new float[5];
        float sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextFloat();
            
        }
        for(int i=0;i<arr.length;i++){
            
            sum= sum+arr[i];
        }
        System.out.println(sum);

    }
}
