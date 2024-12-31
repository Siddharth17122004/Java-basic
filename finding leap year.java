import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N%400==0||(N%4==0&&N%100!=0)){
		    System.out.print("Its a leap year");
		}else{
		    System.out.print("Not a leap year");
		}
	}
}