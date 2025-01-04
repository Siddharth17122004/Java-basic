import java.util.*;
public class Main
{
    public static int reverse(int n,int rev){
       
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	      int num=sc.nextInt();
	      int res=reverse(num,0);
	      ;
	      System.out.print((num==res));
	}
}