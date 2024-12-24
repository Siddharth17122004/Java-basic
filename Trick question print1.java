/******************************************************************************
 * Given 2 numbers,print first number as 5 digit and second in the line with a 5 
  width space,explanation: if the numbers are 25 and 98, print 00025 and    98
                           
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("%05d\n",a);
		System.out.printf("%5d",b);
	}
}