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
	    long fact=1;
	    for(int i=1;i<=num;i++){
	        fact=fact*i;
	    }
	    System.out.printf("The factorial of %d is %d",num,fact);
	 
	}
}