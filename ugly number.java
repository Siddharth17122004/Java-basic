import java.util.*;


public class Main

{
   
        
  
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=true;
		while(num!=1){
		    if(num%2==0){
		        num=num/2;
		    }else if(num%3==0){
		        num=num/3;
		    }else if(num%5==0){
		        num=num/5;
		    }else{
		        flag=false;
		        break;
		    }
		}
		if(flag==true){
		    System.out.print("Ugly number");
		}else{
		    System.out.print("Not ugly number");
		}
		
		
	}
}