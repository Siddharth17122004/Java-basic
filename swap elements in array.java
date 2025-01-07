import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5};
		
		int pos1=sc.nextInt();
		int pos2=sc.nextInt();
	    if(pos1<0||pos2<0||pos1>=arr.length||pos2>=arr.length){
            System.out.print("Invalid");	       
	        return;
	        
	    }
	    int temp;
	    temp=arr[pos1];
		arr[pos1]=arr[pos2];//1,2,3,2,5
		arr[pos2]=temp;//1,4,3,2,5
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	
	}
}