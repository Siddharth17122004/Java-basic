import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	//get input

	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++){
	    System.out.println("Enter the element");
	    arr[i]=sc.nextInt();
	    
	    
	}
	//App 2:
	System.out.println("Elements are");
	for(int i=0;i<size;i++){
	    System.out.println(arr[i]);
	}
	
	}
}