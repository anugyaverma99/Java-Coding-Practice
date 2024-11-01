// write a java program to print hte nth element in fibonacci series.
public class practiceset7q5 {
    static int fibo(int n) {
        int first = 0;
        int second = 1;
        int third = 0;
        int count = 2; 

        // Edge cases
        if (n == 1) return first;
        if (n == 2) return second;

        // Loop to find the n-th Fibonacci number
        while (count < n) {
            third = first + second;
            first = second;
            second = third;
            count++;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fibo(5)); 
}
}