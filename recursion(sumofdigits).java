import java.util.*;
public class Main
{   public static int count(int n){
    if(n==0){
        return 0;//base case
    }
    return (n%10)+count(n/10);//recursive case 
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=count(n);
		System.out.print(res);
	}
}