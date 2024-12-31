import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int num1=0,num2=1,num3=0;
		if(N==1){
		    System.out.print(num1);
		}else if(N==2){
		    System.out.print(num2);
		}else{
		    for(int i=3;i<=N;i++){
		        num3=num2+num1;
		        num1=num2;
		        num2=num3;
		    }
		    System.out.print(num3);
		}
}
}