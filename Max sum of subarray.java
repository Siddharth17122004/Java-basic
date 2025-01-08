public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int ms=0;
		int k=2;
		for(int i=0;i<k;i++){
		    ms=ms+arr[i];
		    
		}
		int cs=ms;
		for(int i=k;i<arr.length;i++){
		    cs=cs+arr[i]-arr[i-k];
		    if(cs>ms){
		        ms=cs;
		    }
		}
		
		    System.out.print(ms);
		
	}
}