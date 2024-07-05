import java.util.Scanner;
public class switchcase_18 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch(age){
            case 18:
            System.out.println("become adult ");
            break;
            case 23:
            System.out.println("get a job");
            break;
            case 60:
            System.out.println("get retired");
            break;
            default:
            System.out.println("enjoy your life");
        }

    }
}
