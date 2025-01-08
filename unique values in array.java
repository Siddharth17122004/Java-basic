public class Main
{
	public static void main(String[] args) {
		int j=1;

		int arr[]={1,1,2,2,3,4};
		for(int i=1;i<arr.length;i++){
		    if(arr[i]!=arr[i-1]){
		        arr[j]=arr[i];
		        j++;
		    }
		  
		   }
		    
	
		for (int i=0;i<j;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}