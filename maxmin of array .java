import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] array1={1,2,3,4,5};
	    int max=array1[0];
	    int min=array1[0];
	    for(int i=0;i<array1.length;i++){
	        if(array1[i]>max){
	           max=array1[i];
	           
	           
	        }
	        if(array1[i]<min){
	            min=array1[i];
	        }
	    }
	    System.out.println(max);
	    System.out.print(min);
	
		
	
}
}