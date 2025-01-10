import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1=str;
	    StringBuffer buf =new StringBuffer(str);
	    buf.reverse();
	    str=buf.toString();
	    if(str.equals(str1)){
	        System.out.print("Palindrome");
	    }else{
	        System.out.print("Not palindrome");
	    }
	
	}
}