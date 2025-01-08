public class Main
{
	public static void main(String[] args) {
		int j=0;

		int arr[]={1,0,2,3,0,4};
		for(int i=0;i<arr.length;i++){
		   if(arr[i]!=0){
		       arr[j]=arr[i];
		       j++;
		   }
		    
		}
		while(j<arr.length){
		    arr[j]=0;
		    j++;
		}
		for (int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}