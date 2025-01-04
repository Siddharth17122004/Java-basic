public class Main
{
    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }
	public static void main(String[] args) {
	      int n=2345;
	      int res=reverse(n,0);
	      System.out.print(res);
	}
}