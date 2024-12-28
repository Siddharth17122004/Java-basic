
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);		
		int n=sc.nextInt();
		int sq=n*n;
		int sum=0;
		while(sq!=0){
		    int rem=sq%10;
		    sum+=rem;
		    sq=sq/10;
		}
		if(n==sum){
		    System.out.println("Neon");
		}else{
		    System.out.print("Not Neon");
		}
	}
}
