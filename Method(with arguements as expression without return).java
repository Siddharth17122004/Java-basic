public class Main {
    public static void sum(int x, int y){
       int s=x+y;
       System.out.println("Sum is: "+s);
    }
    public static void main(String[] args) {
        sum(10,20);
        sum(5+5+5,10+10+10);
    }
}