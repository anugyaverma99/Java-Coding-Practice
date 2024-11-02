// sum of first n natural numbers using iterative fuction.

public class practiceset7q10 {
    static int sum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;

        }
        return s;

    }
    public static void main(String args[]){
        System.out.println(sum(10));
    }
}
