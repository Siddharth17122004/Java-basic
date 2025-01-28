import java.util.*;
abstract class Bank{
    abstract void findtotal(String name,String accNum,float dpsamt);
}
class SBI extends Bank{
    void findtotal(String name,String accNum,float dpsamt){
        int rate;
        if(dpsamt<=20000){
            rate=3;
        }else if(dpsamt<=50000){
            rate=5;

        }else{
            rate=7;
        }
        float interest=(dpsamt*rate)/100;
        float total=interest +dpsamt;
        System.out.println("---------------------");
        System.out.println("SBI: "+name);
        System.out.println("Account: "+accNum);
        System.out.println("Deposit amount: "+dpsamt);
        System.out.println("TOTAL after one year: "+total);

    }
}
class HDFC extends Bank{
    void findtotal(String name,String accNum,float dpsamt){
        int rate;
        if(dpsamt<=20000){
            rate=2;
        }else if(dpsamt<=50000){
            rate=4;

        }else{
            rate=6;
        }
        float interest=(dpsamt*rate)/100;
        float total=interest +dpsamt;
        System.out.println("---------------------");
        System.out.println("HDFC: "+name);
        System.out.println("Account: "+accNum);
        System.out.println("Deposit amount: "+dpsamt);
        System.out.println("TOTAL after one year: "+total);

    }
}
class ICICI extends Bank{
    void findtotal(String name,String accNum,float dpsamt){
        int rate;
        if(dpsamt<=20000){
            rate=4;
        }else if(dpsamt<=50000){
            rate=6;

        }else{
            rate=8;
        }
        float interest=(dpsamt*rate)/100;
        float total=interest +dpsamt;
        System.out.println("---------------------");
        System.out.println("ICICI: "+name);
        System.out.println("Account: "+accNum);
        System.out.println("Deposit amount: "+dpsamt);
        System.out.println("TOTAL after one year: "+total);

    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Enter account number");
        String accNum=sc.nextLine();
        System.out.println("Enter deposit amount");
        float dpsamt=sc.nextFloat();
        Bank b=new SBI();
        b.findtotal(name,accNum,dpsamt);
        b=new HDFC();
        b.findtotal(name,accNum,dpsamt);
        b=new ICICI();
        b.findtotal(name,accNum,dpsamt);

    }
}




















