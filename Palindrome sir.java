import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,1,1,1,1};
	    
	    int start=0;
	    int end=arr.length-1;
	    boolean isPal=true;
	    
	    while(start<end){
	        if(arr[start]!=arr[end])
	        {
	            isPal=false;
	            break;
	        }
	        start++;
	        end--;
	        
	        
	    }
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    if(isPal){
	        System.out.print("Palindrome");
	    }else{
	        System.out.print("Not Palindrome");
	    }

	    
	   
	}
}