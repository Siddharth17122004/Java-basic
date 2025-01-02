public class Main
{
    public static double calculateArea(double radius){
        return Math.PI *radius*radius;
    }
	public static void main(String[] args) {
	    double radius1=5;
	    double area1=calculateArea(radius1);
	    System.out.println("Area of circle 1: " +area1);
	    
	    double radius2=7;
	    double area2=calculateArea(radius2);
	    System.out.println("Area of circle 2: "+area2);
	    
	    double radius3=10;
	    double area3=calculateArea(radius3);
	    System.out.println("Area of circle 3: "+area3);
		
	
	}
}