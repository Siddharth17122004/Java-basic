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