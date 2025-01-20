import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean status=true;
		if(s1.length()!=s2.length()){
		    System.out.println("Not Anagram");
		}else{
		    char[] ch1=s1.toCharArray();
		    char[] ch2=s2.toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    for(int i=0;i<ch1.length;i++){
		        if(ch1[i]!=ch2[i]){
		            status=false;
		            break;
		        }
		    }
		}
		if(status){
		    System.out.print("Anagram");
		}else{
		    System.out.print("Not Anagram");
		}
		
		
		
	}
}