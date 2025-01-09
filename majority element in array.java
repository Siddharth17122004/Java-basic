import java.util.*;
public class Main{
  public static void Find_majority_ele(int arr[],int size){
    int m=size/2;
    int candidate=arr[0];
    int count=1;
    for(int i=1;i<size;i++){
      if(arr[i]==candidate){
        count++;
      }else{
        if(count>m){
          System.out.print("The majority element is : "+candidate);
          return;
        }
        candidate=arr[i];
        count=1;
      }
    }
    if(count>m)
    {
      System.out.print("The majority element is : "+candidate);
    }
    else{
      System.out.print("No majority element found in the array");
    }
  
}
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int arr[]=new int[size];
  for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
  }
  Arrays.sort(arr);
  Find_majority_ele(arr,size);
}
}


