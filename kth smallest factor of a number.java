import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    int smallest=-1;
		    int count=0;
		    for(int i=1;i<=N;i++){
		        if(N%i==0){
		            count++;
		        }
		        if(count==K){
		            smallest=i;
		            break;
		        }
		    }
		    if(smallest!=-1){
		        System.out.printf("The %dth smallest factor is %d",K,smallest);
		    }else{
		        System.out.print("K>number of factors");
		    }
		}
	}
