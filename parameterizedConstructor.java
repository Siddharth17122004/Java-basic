public class Main{
    float l,b;
    Main(float l,float b){
       //this.l=l;
       //this.b=b;
    }
     public float findArea(){
        return l*b;
    }
    public static void main(String[] args){
        Main pc=new Main(4.0f,4.0f);        
        System.out.println(pc.findArea());
    }
}