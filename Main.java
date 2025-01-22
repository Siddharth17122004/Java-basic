public class Main{
    public int a=10;
    public void method1(){
        int a=20;
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String[] args){
        Main m=new Main();
        m.method1();
    }
}