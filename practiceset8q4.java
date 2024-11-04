class Rectangle{
    int length;
    int breadth;
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
         }

}

public class practiceset8q4 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=2;
        r.breadth=3;
        System.out.println(r.area());
        System.out.println(r.perimeter());


    }
}
