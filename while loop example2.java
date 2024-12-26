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
