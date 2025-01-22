public class test{
    float l,b;
    test(float l,float b){
       this.l=l;
       this.b=b;
    }
     public float findArea(){
        return l*b;
    }
    public static void main(String[] args){
        test pc=new test(4.0f,4.0f);        
        System.out.println(pc.findArea());
    }
}