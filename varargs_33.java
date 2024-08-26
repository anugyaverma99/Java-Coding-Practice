public class varargs_33 {
    static int sum(int ...arr){
        //Available as int[] arr;
        int s=0;
        for(int a:arr){
            s+=a;
        }
        return s;

    }
    static int sum2(int x,int ...arr){
        //Available as int[] arr;
        int s=x;
        for(int a:arr){
            s+=a;
        }
        return s;

    }
    public static void main(String[] args){
        // any number of arguments can be passed....in varargs..
        System.out.println(sum2(2,4));// here one value must be passed , otherwise it will show errors..
       // System.out.println(sum2());//this will show error
        System.out.println(sum());//this will not show any error ,result will be 0
System.out.println(sum(4,5));
System.out.println(sum(4,5,6));
System.out.println(sum(4,5,6,7));
    }
}
