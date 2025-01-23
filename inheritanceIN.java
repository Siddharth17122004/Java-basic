class Super{
    private int x=100;
    int y=222;
    public static int z=333;

    public void display1(){

    
        System.out.println("display method from super class");
    }
}
  class sub extends Super{
   
    

    public void display2(){
        System.out.println("Display method from sub class");
    }
}
 public class inheritanceIN
{
    public static void main(String[] args){
        sub b=new sub();
        System.out.println("y value: "+b.y);
        System.out.println("z val is: "+b.z);
        System.out.println("z val is "+Super.z);
        System.out.println("z val is: "+sub.z);
        b.display1();
        b.display2();

    }

}