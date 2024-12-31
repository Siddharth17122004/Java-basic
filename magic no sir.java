import java.util.*;


public class Main

{
   
        
  
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
        while(num>9){
            
            while(num!=0){
                int rem=num%10;
                num=num/10;
                sum+=rem;
            }
            num=sum;
            sum=0;
        }
        
	
		
		if (num==1){
		    System.out.print(num+" magic number");
		}else{
		    System.out.print(num+" Not magic number");
		}
		
	}
}