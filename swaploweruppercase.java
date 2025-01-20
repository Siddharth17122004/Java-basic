public class swaploweruppercase{
    public static void main(String[] args){
        String str="HellO woRlD";
        StringBuffer res=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }else if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
            }
            res.append(ch);
        }
        System.out.println(res);
    }
}