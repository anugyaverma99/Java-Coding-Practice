class Square{
    int side;
    int area(){
        return side*side;
    }
    int perimeter(){
        return 4*side;
         }

}
public class practiceset8q3 {
    public static void main(String[] args) {
        Square s=new Square();
        s.side=10;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
