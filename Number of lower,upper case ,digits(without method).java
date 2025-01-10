public class Main
{
	public static void main(String[] args) {
		String str="3RoseS";
	    int u=0,l=0,d=0;
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);  
		    if(ch>='A'&&ch<='Z'){
		        u++;
		    }else if(ch>='a'&&ch<='z'){
		        l++;
		    }else if(ch>='0'&&ch<='9'){
		        d++;
		    }
		}
		System.out.println("uppercase: "+u);
		System.out.println("lowercase: "+l);
		System.out.println("digits: "+d);
	}
}
