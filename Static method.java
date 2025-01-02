class Main
{
    static int staticVar=100;
    public static void staticMethod(){
        
        System.out.println("Inside static method.");
        }
    public void instanceMethod(){
       
        System.out.println("Static variable in instance method "+staticVar);
        staticMethod();
        Main.staticMethod();
    }
    
	public static void main(String[] args) {
	    Main obj=new Main();
	    obj.instanceMethod();
	    
	    
	}
}