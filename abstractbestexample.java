abstract class Shapes{
    abstract void findArea(float dim1,float dim2);
}
class Circle extends Shapes{
    void findArea(float radius,float unused){
        float res=(float)(Math.PI*radius*radius);
        System.out.println("area of circle: "+res);
    }
}
class Rect extends Shapes{
    void findArea(float length,float breadth){
        float area=length*breadth;
        System.out.println("Area of rectangle: "+area);
    }
}
class Triangle extends Shapes{
    void findArea(float base,float height){
        float area=0.5*base*height;
        System.out.print("Area of triangle: "+area);
    }
}
public class Main{
    public static void main(String[] args){
        Shapes s=new Circle();
        s.findArea(3,3);
        s=new Rect();
        s.findArea(4,5);
        s=new Triangle();
        s.findArea(5,5);
    }
}