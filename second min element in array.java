
public class Main
{
	public static void main(String[] args) {
		int arr[]={-500,-200,-100,-300,-100};
		int min=Integer.MAX_VALUE;//2,147,483,648
		int secondMin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]<min){
		        secondMin=min;
		        min=arr[i];
		    }
		    else if(arr[i]<secondMin&&arr[i]!=min)
		    {
		        secondMin=arr[i];
		    }
		}
		System.out.println("Min; "+min);
		System.out.println("Second Min: "+secondMin);
	}
}