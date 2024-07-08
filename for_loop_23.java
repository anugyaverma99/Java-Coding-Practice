import java.util.Scanner;
public class for_loop_23 {
    public static void main(String[] args) {
        // for(int i=0;i<=10;i++){
        //     System.out.println(i);
        // }

        // write a java program to print first n odd numbers using for loop.
        // for(int i=1;i<=20;i=i+2){
        //     System.out.println(i);
        // }

        //Decrementing for-loop
        // int i=5;
        // for( i=5;i>0;i--){
        //     System.out.println(i);
        // }
         
        //wap to print first n natural numbsers in java.
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }



    }
}
