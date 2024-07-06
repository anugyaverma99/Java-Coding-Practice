// write a program to find whether the student failed or passed ,if it requires
 //total 40% and atleast 33% in each subject to pass.
 
import java.util.Scanner;
public class practiceset4q2 {
    public static void main(String[] args) {
        System.out.println("Enter marks of three subjects out of 100");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float total=a+b+c;
        float a1=(float)40/100;
        float a2=(float)33/100;
        float passingmarks=a2*100;
      
        float total_passingmarks=a1*300;


        
        if(a>=passingmarks && b>passingmarks && c>passingmarks && total>=total_passingmarks){
            System.out.println("sudent is passed");

        }
        else{
            System.out.println("student is failed");
        }




    }
}
