/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0;
       while(n!=0){
           int rem=n%10;
           count=count+rem;
           n=n/10;
       }
       System.out.print(count);
    }
}