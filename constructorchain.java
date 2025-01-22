public class constructorchain{
    public constructorchain(int a,int b){
        System.out.println(a+b);
    }
    public constructorchain(int a,int b,int c){
        this(5,5);
        System.out.println(a+b+c);
    }
    public constructorchain(String a,String b){
        this(5,5,5);
        System.out.println(a+b);
    }

    public constructorchain(double a,double b){
        this("hello","world");
        System.out.println(a+b);
    }
    public static void main(String[] args){
        constructoroverload c1=new constructorchain(10.0,20.0);
        
    }

}