import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sumeven=0;
		int sumodd=0;
		//get row size
		int rows=sc.nextInt();
		// declare array with row size
		int arr[]=new int[rows];
		//get array input
		for(int i=0;i<rows;i++){
		    
		        arr[i]=sc.nextInt();
		    }
		//display array values
		 for(int i=0;i<rows;i++){
		     System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		 for(int i=0;i<rows;i++){
		     if(arr[i]%2==0){
		         sumeven+=arr[i];
		     }else if(arr[i]%2!=0){
		         sumodd+=arr[i];
		     }
		 }
		 System.out.println("Even sum: "+sumeven);
		 System.out.println("Odd sum: "+sumodd);
	}
}