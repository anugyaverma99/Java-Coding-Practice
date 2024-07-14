// write a java rpogram to find whether an array is sorted or not.
public class practiceset6q7 {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,11,8};
        boolean r=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                r=false;
                break;
            }
        }
        if(r){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
