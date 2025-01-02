scope of local variable:
public class Main
{
    public static double methodA(int a){
        
        int localVar=10;
    }
	public static void main(String[] args) {
	    System.out.printf("%d", localVar);
	    
	}
}
output:
Main.java:8: error: cannot find symbol
	    System.out.printf("%d", localVar);
	                            ^
  symbol:   variable localVar
  location: class Main
1 error

Initializing local variable:
public class Main
{
    public static void methodA(int a){
        
        int localVar;
        System.out.println(localVar);
    }
	public static void main(String[] args) {
	    methodA(4);
	    
	}
}

Main.java:6: error: variable localVar might not have been initialized
        System.out.println(localVar);
                           ^
1 error
