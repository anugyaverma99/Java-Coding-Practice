//write a java program to calculate average marks from an array containing marks of all students in physics using for each loop.

import java.util.Scanner;

public class practiceset6q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of students");
        int n=sc.nextInt();
        float[] marks=new float[n];
        System.out.println("enter physics marks of all students");
        
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextFloat();
        }

        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        float avg=sum/n;
        System.out.println("average of 5 students: "+avg);



    }
}
