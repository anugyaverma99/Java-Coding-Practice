public class methods_31 {
//  static int logic(int x,int y){ // static keyword is used to make a static reference to a static method logic().
//     int z;
//     if(x>y)
//     z=x+y;
//     else
//     z=(x+y)*5;
//     return z;
// }

///not static method 
 int logic(int x,int y){ 
    int z;
    if(x>y)
    z=x+y;
    else
    z=(x+y)*5;
    return z;
}
    public static void main(String[] args) {
        int a=5;
        int b=7;
        // object creation and calling
        methods_31 obj =new methods_31();
        int c=obj.logic(a,b);
        System.out.println(c);

    }
}
