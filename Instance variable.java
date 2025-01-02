ACCESSING:
public class Main
{
    int instanceVar=10;
    public void  methodA(){
       
       
        System.out.println("Accessing instanceVar in methodA "+instanceVar);
    }
    public  void  methodB(){
       
       
        System.out.println("Accessing instanceVar in methodB "+instanceVar);
    }
    
	public static void main(String[] args) {
	    Main obj1= new Main();
	    Main obj2=new Main();
	    
	    obj1.methodA();
	    obj1.methodB();
	    
	    System.out.println("obj1 instanceVar: " +obj1.instanceVar);
	    System.out.println("obj2 instanceVar: " +obj2.instanceVar);
	}
}
INITIALIZATION:
public class Main
{
    int intVar;
    float floatVar;
    boolean boolVar;
    String stringVar;
    
    public void displayDefaults(){
       System.out.println("Default int var "+intVar);
       System.out.println("Default float var "+floatVar);
       System.out.println("Default boolean var "+boolVar);
       System.out.println("Default string var "+stringVar);
    }
   
    
	public static void main(String[] args) {
	    Main obj1= new Main();
	    
	    obj1.displayDefaults();
	    
	    
	}
}
output:
Default int var 0
Default float var 0.0
Default boolean var false
Default string var null
