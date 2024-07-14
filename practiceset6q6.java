// write a java program to find maximum element of an array.

import java.util.Scanner;
public class practiceset6q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.print("amximum element of array is: ");
        System.out.println(max);
    }
}
