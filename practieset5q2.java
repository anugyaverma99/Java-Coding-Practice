//write a java program to print the sum of first n even numbers.
import java.util.Scanner;
public class practieset5q2 {
    public static void main(String[] args) {
        System.out.println("enter thr number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int sum=0;
        // for(int i=1;c<n;i++){
        //     if(i%2==0){
        //         sum=sum+i;
        //         c+=1;
        //     }
            
            
        // }

        // using while loop

    //     while(c<n){
    //         int i=1;
    //         boolean b=true;
    //         while(b){
    //     if(i%2==0){
    //         sum=sum+i;
    //         c++;

    //     }
    //     i++;
    //     if(c==n){
    //         b=false;
    //     }
    // }
    //     }
        System.out.print("sum of n even numbers:");
        System.out.println(sum);
        // System.out.println(c);

    }
}
