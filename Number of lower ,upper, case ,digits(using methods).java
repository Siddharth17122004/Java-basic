public class Main
{
	public static void main(String[] args) {
		String str="3RoseS";
	    int u=0,l=0,d=0;
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);  
		    if(Character.isUpperCase(ch)){
		        u++;
		    }else if(Character.isLowerCase(ch)){
		        l++;
		    }else if(Character.isDigit(ch)){
		        d++;
		    }
		}
		System.out.println("uppercase: "+u);
		System.out.println("lowercase: "+l);
		System.out.println("digits: "+d);
	}
}
