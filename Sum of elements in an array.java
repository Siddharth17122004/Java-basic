import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     int sum=0;	
	//get input

	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the element");
	for(int i=0;i<size;i++){
	  
	    arr[i]=sc.nextInt();
	    
	    
	}
	for(int i=0;i<size;i++){
	    sum+=arr[i];
	}
	//App 2:
	System.out.println("Elements are");
	for(int i=0;i<size;i++){
	    System.out.println(arr[i]);
	}
	System.out.println("Sum is: "+sum);
	
	}
}