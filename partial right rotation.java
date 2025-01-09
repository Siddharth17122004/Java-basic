import java.util.*;
public class Main
{
    public static void reverse(int arr[],int start,int end){
        while(start<end){ 
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int arr[],int size,int rot){
       int mid=size/2;
    	int fhs=size-mid;
    	rot=rot%fhs;
	reverse(arr,0,fhs-1);
        reverse(arr,0,rot-1);
        reverse(arr,rot,fhs-1);
    
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]={1,2,3,4,5};
    int rot=sc.nextInt();
    int size=arr.length;
    
    rotate(arr,size,rot);
    
		for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i]+" ");
	}
}
}
	
