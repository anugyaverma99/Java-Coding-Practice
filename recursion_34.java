public class recursion_34 {
    //  static int  factorial(int n){
    //     if(n==1 ||n==0){
    //         return 1;
    //     }
    //     else{
    //     return n*factorial(n-1);}
    // }
    static int fibo(int n){
        int first=0;
        int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        int count=n-2;
        while(count>=1){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
            count--;
        }
        return n;
    }

    public static void main(String[] args) {
        // System.out.println(factorial(4));
        fibo(9);
    }
}

