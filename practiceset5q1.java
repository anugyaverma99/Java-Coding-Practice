// write a java program for pattern printing.

public  class practiceset5q1{
    public static void main(String[] args) {
        int n=5;
        // while(i>0){
        //     for(int j=0;j<i;j++)
        //     System.out.print("*");
        //     System.out.println("\n");
        //     i--;
        // }

        // USING FOR LOOP
        // for(int i=n;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println("\n");
        // }

        // USING WHILE LOOP
        while(n>0){
            int i=n;
            while(i>0){
                System.out.print("*");
                i--;
            }
            System.out.println("\n");
            n--;

        }
        
        }
    }

