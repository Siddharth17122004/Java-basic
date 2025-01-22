//Default Constructor(non-parameterized)
public class Rect{
    public float l,b;
    Rect(){
        l=4.0f;
        b=4.0f;
    }
    public float findArea(){

        return l*b;
    }
    public static void main(String[] args){
        Rect r=new Rect();
       System.out.println(r.findArea());
    }
}