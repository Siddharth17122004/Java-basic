public class Main {
    public static void checkDivisibility(int a, int b){
        if(a%b==0){
            System.out.println(a+" is divisible by "+b);
        }else{
            System.out.println(a+ " is not divisible by "+b);
        }
        
    }
    public static void main(String[] args) {
        checkDivisibility(15,5);
        checkDivisibility(20,3);
    }
}