// Write a function to find a average of a set of numbers passed as arguments.

public class practiceset7q6 {
    static int avg(int ...arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(avg(2,3,5,6,7));
        
    }
}
