import java.util.*;
public class wordformatchecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int l=0;
        int u=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                l++;
                }
            else if(ch>='A'&&ch<='Z'){
                u++;
            }
        }
        
            if(l==str.length()||u==str.length()||l==str.length()-1&&Character.isUpperCase(str.charAt(0))){
                System.out.println("Correct Word format");

            }else{
                System.out.println("Incorrect Word format");
            }
            
        }
    }
