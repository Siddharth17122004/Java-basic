public class constructoroverload{
    public constructoroverload(int a,int b){
        System.out.println(a+b);
    }
    public constructoroverload(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public constructoroverload(String a,String b){
        System.out.println(a+b);
    }

    public constructoroverload(double a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        constructoroverload c1=new constructoroverload(10.0,20.0);
        constructoroverload c2=new constructoroverload(10,20,30);
        constructoroverload c3=new constructoroverload("hello", "world");
        constructoroverload c4=new constructoroverload(10, 20);
    }

}