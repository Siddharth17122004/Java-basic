
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number");
	    int n=sc.nextInt();
	    int temp1=n;
	    int temp2=n;
	    int count=0;
	    int sum=0;
		while(n!=0){
		    n=n/10;
		    count++;
		}
		
		while(temp1!=0){
		    int rem=temp1%10;
		    sum=sum+(int)Math.pow(rem,count);
		    temp1=temp1/10;
		    
		}
		if(sum==temp2){
		    	System.out.print("The number is armstrong " +sum);
		    	
		    
		}else{
		    System.out.print("The number is not armstrong");
		}
	
	}
}
