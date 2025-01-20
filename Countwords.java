import java.util.*;
public class Countwords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        str=str.replaceAll("  "," ");
        int count=1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                count++;

            }
        }
        System.out.println(count);
    
    }
}