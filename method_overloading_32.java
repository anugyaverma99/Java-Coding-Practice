public class method_overloading_32 {
    
//     // void return type
//     static void tell_joke(){
//     System.out.println("i am perfect");
// }
// static int change(int a){
//     return a+2;
// }
 
// static void change2(int []array){
//     array[0]=99;
    
// }

//METHOD OVERLOADING
static void foo(){
    System.out.println("good morning");
}
static void foo(int a){
    System.out.println("good evening");

}

    public static void main(String args[]){
        // tell_joke();
        // int x=10;
        // int[] arr={10,20,25};
        // change(x);
        // System.out.println(x);//x value will still be 10, no change
        // change2(arr);
        // System.out.println(arr[0]); // here value of arr[0] will be changed
   
  
        //method overloading 
        foo();
        foo(5);


    }
}


