abstract class SuperA{
    void method1(){//non abstract method
        System.out.println("non abstract method");
    }
    void method2(){//null body method
        
    }
    abstract void method(int a,int b); //abstract method 
     void method(int a, int b){
        int sub=a-b;
        System.out.println("over riding abstractmethod  in super class "+sub);
    }
    
}
class SubB extends SuperA{
    void method(int a,int b){
        System.out.println("over riding abstract method in sub class" +a*b);
    }
}
public class abstract{
    public static void main(String[] args){
        SuperA a=new SubB();
        a.method1();
        a.method2();
        a.method(1,2);
    }
}