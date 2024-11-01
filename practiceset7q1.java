// write a java method to print multiplication table of a number n.
public class practiceset7q1 {
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        table(9);
        
    }
}
