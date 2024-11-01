// Write a recursive function to print the sum of first n natural numbers.

public class practiceset7q3 {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(6));
        
    }
}
