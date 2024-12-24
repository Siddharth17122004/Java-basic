/******************************************************************************

                            largest number using ternary operator
*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	
	int x=num1>num2 ? num1:num2;
	int result=x>num3 ? x:num3;
	System.out.print("Largest number is "+result);
	
}
}