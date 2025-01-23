class Super{
    int x=100;
    public void display(){

    
        System.out.println("display method from super class");
    }
}
 class sub{
    int y=200;
    Super a=new Super();

    public void display(){
        System.out.println("Display method from sub class");
    }
}
public class inheritancehas
{
    public static void main(String[] args){
        sub b=new sub();
        System.out.println("x value: "+b.a.x);
        System.out.println("y val is: "+b.y);
        b.a.display();
        b.display();

    }

}