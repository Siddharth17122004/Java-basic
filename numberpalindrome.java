/******************************************************************************

                           
*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int temp=n;
       int count=0;
       while(n!=0){
           int rem=n%10;
           count=(count*10)+rem;
           n=n/10;
       }
       if(count==temp){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not a Palindrome");
       }
       System.out.print(count);
    }
} 