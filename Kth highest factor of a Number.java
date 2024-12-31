import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    int largest=-1;
		    int count=0;
		    for(int i=N;i>0;i--){
		        if(N%i==0){
		            count++;
		        }
		        if(count==K){
		            largest=i;
		            break;
		        }
		    }
		    if(largest !=-1){
		        System.out.printf("The %dth largest factor is %d",K,largest);
		    }else{
		        System.out.print("K>number of factors");
		    }
		}
	}
