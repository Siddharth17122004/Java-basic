Accessing without object:
class Main
{
    int instanceVar=42;
    public void displayInstanceVar(){
        
        System.out.println("Instance Variable: "+instanceVar);
        }
    public void greet(){
       
        System.out.println("Hello from greet method!");
        displayInstanceVar();
    }
    
	public static void main(String[] args) {
	    greet();
	}
}
output:
Main.java:15: error: non-static method greet() cannot be referenced from a static context
	    greet();
	    ^
1 error

	
	Accessing with object:
	
class Main
{
    int instanceVar=42;
    public void displayInstanceVar(){
        
        System.out.println("Instance Variable: "+instanceVar);
        }
    public void greet(){
       
        System.out.println("Hello from greet method!");
        displayInstanceVar();
    }
    
	public static void main(String[] args) {
	    Main d = new Main();
	    d.displayInstanceVar();
	    d.greet();
	   
	}
}
output:
Instance Variable: 42
Hello from greet method!
Instance Variable: 42
