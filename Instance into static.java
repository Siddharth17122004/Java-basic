//Cannot access instance variables and methods directly into static methods 
public class Main
{
    int Var=50;
    public void instanceMethod(){
        System.out.println("Inside instanceMethod: Instance Variable="+instanceVar);
        
        
    }
    public static void staticMethod(){
        System.out.println("Inside staticMethod");
        System.out.println(instanceVar);
        instanceMethod();

    }
	public static void main(String[] args) {
	    staticMethod();
	     
	}
}