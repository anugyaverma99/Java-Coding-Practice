// write a java program to calculate the sum of multiplication table of 8.

public class practiceset5q6 {
    public static void main(String[] args) {
        int n=8;
        int sum=0;
        for(int i=1;i<=10;i++){
            int t=n*i;
            sum=sum+t;

        }
        System.out.print("Sum of multiplication table of 8 is ");
        System.out.println(sum);
    }
}
