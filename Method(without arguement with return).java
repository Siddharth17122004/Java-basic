public class Main {
    public static int findRemainder(){
        int dividend=29,divisor=5;
        return dividend%divisor;
    }
    public static void main(String[] args) {
        int remainder=findRemainder();
        System.out.println("remainder when 29 is divided by 5: "+remainder);
    }
}