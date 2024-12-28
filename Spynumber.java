/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    int pro=1;
       
	   
	   
	    while(n>0){
	        int rem=n%10;
	        n=n/10;
	        sum+=rem;
	        pro*=rem;
	    }
	
	    if(sum==pro){
	        System.out.println("Yes, its a spy number");
	    }else{
	        System.out.print("Not a spy Number");
	        
	    }
	
	}
}