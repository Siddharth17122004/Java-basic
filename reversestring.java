import java.util.*;
public class reversestring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="Hello_welcome_to_java";
        String[] words=str.split("_");
        String rev="";
        for(int i=words.length-1;i>=0;i--){
            if(i!=0){
                rev=rev+words[i]+"_";
            }else if(i==0){
                rev=rev+words[i];
            }
        }
        System.out.println(rev);
    }
}