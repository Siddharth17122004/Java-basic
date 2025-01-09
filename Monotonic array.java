import java.util.*;
public class Main{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        boolean decreasing =true;
        boolean increasing=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                decreasing=false;
                
            }else if(arr[i]<=arr[i-1]){
                increasing=false;
            }
        }
        if(increasing==true||decreasing==true){
            System.out.print("Monotonic");
        }else{
            System.out.print("Non Monotonic");
        }
    }
}