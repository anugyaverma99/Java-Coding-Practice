// write a java program to add two matics of size 2X3.

import java.util.Scanner;
public class practiceset6q4 {
    public static void main(String[] args) {
        int[][] a=new int[2][3];
        int[][] b=new int[2][3];
        int[][] sum=new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements of first array");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements of second array");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of both arrays");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
