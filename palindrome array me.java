import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,1,1,1,1};
	    int arr1[]=new int[5];
	    int start=0;
	    int end=arr.length-1;
	    for(int i=0;i<arr.length;i++){
	        arr1[i]=arr[i];
	        
	    }
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr1[i]+" ");
	    }
	    System.out.println();
	    while(start<end){
	        int temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	    }
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    if(Arrays.equals(arr,arr1)){
	        System.out.print("Palindrome");
	    }else{
	        System.out.print("Not Palindrome");
	    }

	    
	   
	}
}