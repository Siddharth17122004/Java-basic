import java.util.*;
public class extractuppercase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="HellO";
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                res=res+ch;
            }
        }
        System.out.println(res);
        
        
       
        
    }
}