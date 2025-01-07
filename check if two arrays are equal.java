import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] array1={1,2,3,4,5};
		int[] array2={1,2,4,5,8};
		boolean status=true;
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(array1.length==array2.length){
		    for(int i=0;i<array1.length;i++){
		        if (array1[i]!=array2[i]){
		            status=false;
		            break;
		        }
		    }
		}
		else{
		    status=false;
		}
		if(status==true){
		    System.out.print("arrays are equal");
		}else{
		    System.out.print("arrays are not equal");
		}
}
}