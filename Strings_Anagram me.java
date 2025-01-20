import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int count=0;
		if(str.length()==str1.length()){
		    
		
		for(int i=0;i<str.length();i++){
		    for(int j=0;j<str.length();j++){
		        char ch=str.charAt(i);
		        char ch1=str1.charAt(j);
		        if(ch==ch1){
		            count++;
		        }
		    }
		}
	
		}
		if(count==str.length()){
		    System.out.print("Anagram");
		}else{
		    System.out.print("Not Anagram");
		}
		
	}
}