class SuperA{
    void method1(){
        System.out.println("SuperA");
    }
}
class SubB extends SuperA{
    void method1(){
        super.method1();
        System.out.println("SubB");
    }
}
public class Main{
    public static void main(String[] args){
        SubB sb=new SubB();
        sb.method1();
        

    }
    
}