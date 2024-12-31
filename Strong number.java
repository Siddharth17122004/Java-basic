import java.util.*;
public class Main{
public static int factorial(int num){
    int fact=1;
    for(int i=1;i<=num;i++){
        fact*=i;
    }
    return fact;
}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int N=sc.nextInt();
		int orig=N;
		while(N!=0){
		    int rem=N%10;
		    sum+=factorial(rem);
		    N=N/10;
		}
		System.out.print("Factorial of "+orig+" is "+sum);
	}
}