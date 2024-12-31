import java.util.*;


public class Main

{
    public static int summer(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            sum+=rem;
        }
        return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
		    N=summer(N);
		}
		if (N==1){
		    System.out.print(N+" magic number");
		}else{
		    System.out.print(N+" Not magic number");
		}
		
	}
}