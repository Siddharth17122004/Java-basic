class SuperA{
    SuperA(){
        System.out.println("default constructor of super class");
    }
    SuperA(int x){
        System.out.println("parameterized constructor of super class with value: "+x);
    }
}

class SubB extends SuperA{
    SubB(int x){
        super(145);//comment this line to see diff output
        System.out.println("parameterized constructor of sub class with value: "+x);

    }
}
public class Main{
    public static void main(String[] args){
        SubB sb=new SubB(123);
    }
}