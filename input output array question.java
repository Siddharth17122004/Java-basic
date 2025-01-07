public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		
		int sum=0;
		for(int i=0;i<arr.length;i++){
		    sum+=arr[i];
		}
		System.out.println(sum);
		for(int i=0;i<arr.length;i++){
		    arr[i]=sum-arr[i];
		    sum=arr[i];
		}
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
output:
15
14 12 9 5 0 

