
public class Main
{
	public static void main(String[] args) {
		int arr[]={-500,-200,-100,-300,-100};
		int max=Integer.MIN_VALUE;//2,147,483,648
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>max){
		        secondMax=max;
		        max=arr[i];
		    }
		    else if(arr[i]>secondMax&&arr[i]!=max)
		    {
		        secondMax=arr[i];
		    }
		}
		System.out.println("Second Max: "+secondMax);
	}
}