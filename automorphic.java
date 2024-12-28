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
		int num=sc.nextInt();
		int sq=num*num;
	    int flag=0;
	
	    
	    
	    while(num>0){
           	if(num%10!=sq%10){
           	    flag=1;
           	    break;
           	}else{
           	    sq=sq/10;
           	    num=num/10;
           	}	  
		    
	    }
	
		
		if(flag==0){
		    System.out.println("Automorphic");
		}else{
		    System.out.print("Not Automorphic");
		}
	}
}