import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
      
    }
    int pos=sc.nextInt();
    if(pos<0||pos>=size){
      System.out.print("Deletion not possible");
    }else{
      for(int i=0;i<size;i++){
        if(i!=pos-1){
          System.out.print(arr[i]+" ");
        }
      }
    }
  }
}