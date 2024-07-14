// write a java program to reverse the 2-D array. 

import java.util.Scanner;
public class practiceset6q5 {
    public static void main(String[] args) {
        // System.out.println("enter the no.of coumns and rows");
         Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // int[][] arr=new int[n][m];
        // int[][] rev=new int[m][n];
        // System.out.println("enter elements of original array");
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // System.out.println("original array:");
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println("\n");
        // }
        // System.out.println("reverse array");
        // for(int i=0;i<rev.length;i++){
        //     for(int j=0;j<rev[i].length;j++){
        //         rev[i][j]=arr[j][i];
        //     }
        // }
        // for(int i=0;i<rev.length;i++){
        //     for(int j=0;j<rev[i].length;j++){
        //         System.out.print(rev[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println("\n");
        // }


        // 1-D ARRAY.
        int[] arr={1,2,3,4,5,6};
        
        int l=arr.length;
        int re=l/2;
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);

        }
        System.out.println("\n");
        for(int i=0;i<re;i++){
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        System.out.println("\n");
    }
}

// 