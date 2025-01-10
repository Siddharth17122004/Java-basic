import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==1||i==n||j==1||j==n||i==j){
          System.out.print("1");
        }else if(i+j==n||i+j==n+2){
          System.out.print("0");
        }else{
            System.out.print("1");
        }
      }
      System.out.println();
    }
  }
}