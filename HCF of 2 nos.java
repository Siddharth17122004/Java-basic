import java.util.*;
public class Main{
	public static int hcf(int num1, int num2){
	    int h=1;
	    int min=(num1<num2)?num1:num2;
	    for(int i=1;i<=min;i++){
	        if(num1%i==0&&num2%i==0){
	            h=i;
	        }
	        
	    }
	    return h;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int x=hcf(N1,N2);
		System.out.print("HCF is "+x);
       

	
		}
	}
		
	
