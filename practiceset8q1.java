class Employee1{
    int salary;
    String name;
    public void setname(String name){
       this.name=name;
    }
    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }


}
public class practiceset8q1 {
    public static void main(String[] args) {
        Employee1 harry=new Employee1();
        harry.salary=233333;
        harry.setname("codewithharry");
        System.out.println(harry.getname()+ harry.getSalary());

    }
}
