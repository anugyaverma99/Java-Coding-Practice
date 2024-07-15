public class arrays_27 {
    public static void main(String[] args) {
        int[] marks={10,23,54,35 };
       System.out.println(marks.length);
       String[] stu={ "harry","shubhAM","potter" };
       //System.out.println(stu[2]);
       
       // PRINTING USING FOR LOOP
    //    for(int i=0;i<marks.length;i++){
    //     System.out.println(marks[i]);
    //    }

    //QUIZ -PRINTING ARRAY ELEMENTS IN REVERSE IN JAVA.

    // for(int i=stu.length-1;i>=0;i--){
    //     System.out.println(stu[i]);
    // }

    //PRINTING ELEMENTS USING for-each LOOP.
    for(String elements:stu){
        System.out.println(elements);
    }
    }
}
