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
	    
	    int guessnum=5;
	    while (true){
	        System.out.print("Enter a number");
	        int val=sc.nextInt();
	        if(val==guessnum){
	            System.out.print("Correct");
	            break;
	        }
	         
	    }
	   
	    
	 
	}
}