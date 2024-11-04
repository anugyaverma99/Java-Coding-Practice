class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void call(){
        System.out.println("calling.....");
    }
}
public class practiceset8q2 {
    public static void main(String[] args) {
        cellphone c=new cellphone();
        c.call();
        c.ring();
    }
}
