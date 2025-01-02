Trying to access local variable: error in output
class Main
{
    int y=222;
    void method1(){
        int x=111;
        System.out.println("Mtd-1 x: "+x);
        System.out.println("Mtd-1 y: "+y);
        }
    void method2(){
        System.out.println("Mtd-2 x: "+x);
        System.out.println("Mtd-2 y: "+y);
    }
    
	public static void main(String[] args) {
	    Main d = new Main();
	    d.method1();
	    d.method2();
	    System.out.println("Main x: "+d.y);
	    System.out.println("Main x: "+d.x);
	}
}
output :
Main.java:10: error: cannot find symbol
        System.out.println("Mtd-2 x: "+x);
                                       ^
  symbol:   variable x
  location: class Main
Main.java:19: error: cannot find symbol
	    System.out.println("Main x: "+d.x);
	                                   ^
  symbol:   variable x
  location: variable d of type Main
2 errors

Corrected Code:
	
class Main
{
    int y=222;
    void method1(){
        int x=111;
        System.out.println("Mtd-1 x: "+x);
        System.out.println("Mtd-1 y: "+y);
        }
    void method2(){
       // System.out.println("Mtd-2 x: "+x);
        System.out.println("Mtd-2 y: "+y);
    }
    
	public static void main(String[] args) {
	    Main d = new Main();
	    d.method1();
	    d.method2();
	    System.out.println("Main y: "+d.y);
	    //System.out.println("Main x: "+d.x);
	}
}
output
Mtd-1 x: 111
Mtd-1 y: 222
Mtd-2 y: 222
Main y: 222
