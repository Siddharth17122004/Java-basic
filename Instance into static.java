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
output:
Main.java:6: error: cannot find symbol
        System.out.println("Inside instanceMethod: Instance Variable="+instanceVar);
                                                                       ^
  symbol:   variable instanceVar
  location: class Main
Main.java:12: error: cannot find symbol
        System.out.println(instanceVar);
                           ^
  symbol:   variable instanceVar
  location: class Main
Main.java:13: error: non-static method instanceMethod() cannot be referenced from a static context
        instanceMethod();
        ^
3 errors
// accessing using object instance variables and methods directly into static methods 
public class Main
{
    int instanceVar=50;
    public void instanceMethod(){
        System.out.println("Inside instanceMethod: Instance Variable="+instanceVar);
        
        
    }
    public static void staticMethod(){
        System.out.println("Inside staticMethod");
        Main obj=new Main();
        System.out.println("Accessing instanceVar via object: "+obj.instanceVar);
        obj.instanceMethod();
    }
	public static void main(String[] args) {
	    staticMethod();
	     
	}
}
output:
Inside staticMethod
Accessing instanceVar via object: 50
Inside instanceMethod: Instance Variable=50
