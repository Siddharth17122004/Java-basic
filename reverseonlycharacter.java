public class reverseonlycharacter{
    public static void main(String[] args){
        String str="12ab$c";
        //output string="12cb$a"
        char[] c=str.toCharArray();
        int left=0;
        int right=c.length-1;
        while(left<right){
            if(!Character.isAlphabetic(c[left])){
                left++;
            }else if(!Character.isAlphabetic(c[right])){
                right--;
            }else{
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;

            }
        }
        String res=new String(c);
        System.out.println(res);

    }
}