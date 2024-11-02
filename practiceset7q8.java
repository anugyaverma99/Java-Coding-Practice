// printing reverse star pattern using recursion.

public class practiceset7q8 {
    
        static void pattern(int n){
            if(n>0){
            
            for(int i=n;i>=1;i--){
                System.out.print("* ");
            }
            System.out.println();
            
            pattern(n-1);
        }
        }
        public static void main(String args[]){
            pattern(5);
    
        }
    }

