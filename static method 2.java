public class Main
{
    static int staticVar=100;
    public static void method1(){
        System.out.println("Inside method1");
        System.out.println("Static variable "+staticVar);
        
    }
    public static void method2(){
        System.out.println("Inside method2");
        method1();//Directly accessing a static variable 
        Main.method1(); // accessing using class name use this for good programming culture
    }
	public static void main(String[] args) {
	    Main.method2();
	    
	}
}
output:
Inside method2
Inside method1
Static variable 100
Inside method1
Static variable 100
