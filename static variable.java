class Main
{
    static int staticVar=42;
    ;
	public static void main(String[] args) {
	    System.out.println("Accessing static Var using class name: " +Main.staticVar);//using class name
	    System.out.println("Accessing directly: "+staticVar);//accessing directly
	    Main obj=new Main();
	    System.out.println("Accessing using object "+obj.staticVar);//using object
	}
}