/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	
	    int n=123456;
	    int revn=0;
	    int size=3;

	   
	   
	    while(size>0){
	        int rem=n%10;
	        n=n/10;
	        revn=revn*10+rem;
	        size--;
	    }
	    System.out.print(n+""+revn);
	
	}
}