//write a java program to detect double and triple spaces in a given string.

public class practiceset3stringsq4 {
    public static void main(String args[]){
        String str="this sentence is having  double and   triple spaces";
        int n1=str.indexOf("  ");
        int n2=str.indexOf("   ");
        if(n1!=-1)
        System.out.println("the string is having double space at index "+n1);
        if(n2!=-1)
        System.out.println("the string is having triple space at index "+n2);
    }
}
