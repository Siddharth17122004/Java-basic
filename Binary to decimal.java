import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    int d=0;
    int p=0;
    while(n!=0){
      long rem=n%10;
      d+=rem*Math.pow(2,p);
      n=n/10;
      p++;
    }
    
    
    System.out.print(d);
  }
}