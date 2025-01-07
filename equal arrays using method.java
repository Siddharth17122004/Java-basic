import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] array1={1,2,3,4,5};
		int[] array2={1,2,4,5,8};
	
		Arrays.sort(array1);
		Arrays.sort(array2);
		boolean status =Arrays.equals(array1,array2);
		if(status==true){
		    System.out.print("Arrays are equal");
		}else{
		    System.out.print("Arrays are not equal");
		}
	
}
}