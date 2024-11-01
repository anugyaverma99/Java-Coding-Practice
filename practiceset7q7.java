//printing star pattern using recursion
public class practiceset7q7 {
    static void pattern(int n){
        if(n>0){
        pattern(n-1);
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();
        }
        
    }
    public static void main(String args[]){
        pattern(5);

    }
}
//if n=3;
// it will work as
// pattern(2)+ print * 3 times;
// patern(1)+ print * 2 times in next line + print * 3 times;
// patern(0)+ print * 1 times in next line + print * 2 times in next line + print * 3 times;
// result = print * 1 times in next line + print * 2 times in next line + print * 3 times;